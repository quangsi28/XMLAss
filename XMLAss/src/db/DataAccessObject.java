package db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import main.Instance;
import main.Object.HopDong;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * @author khang
 */
public class DataAccessObject implements Serializable {
    public static enum MODE_UPDATE {
        LARGE_UPDATE, SMALL_UPDATE
    }

    private final ResourceBundle rb = ResourceBundle.getBundle("db.db_config", Locale.getDefault());
    private Connection conn = null;
    private final String DB_USERNAME = rb.getString("DB_USERNAME");
    private final String DB_PASSWORD = rb.getString("DB_PASSWORD");
    private final String SERVER_NAME = rb.getString("SERVER_NAME");
    private final String PORT = rb.getString("PORT");
    private final String DATABASE_NAME = rb.getString("DATABASE_NAME");
    private String connectionString = "jdbc:sqlserver://" + SERVER_NAME + ":" + PORT + ";databaseName = " + DATABASE_NAME;

    public DataAccessObject()  {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //open db connection
            conn = DriverManager.getConnection(connectionString, DB_USERNAME, DB_PASSWORD);
        
            

        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        closeConnection();
    }

    public Connection getConn() {
        return conn;
    }

    public boolean executeSQLwithParams(String sqlUpdate, MODE_UPDATE MODE, String... params) throws SQLException {
        try {
            conn.setAutoCommit(false);
            PreparedStatement ps = conn.prepareStatement(sqlUpdate);
            int paramsCount = 0;
            for (String param : params) {
                paramsCount++;
                ps.setString(paramsCount, param);
            }
//            System.out.println(ps.toString());
            if (MODE == MODE_UPDATE.SMALL_UPDATE) {
                ps.executeUpdate();
            } else {
                ps.executeLargeUpdate();
            }
            conn.commit();
            return true;
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    System.err.print("Transaction is being rolled back");
                    conn.rollback();
                } catch (SQLException excep) {
                    System.err.println(excep.getMessage());
                }
            }
            return false;
        } finally {
            conn.setAutoCommit(true);
        }
    }
    
    public void executeSQL(String sql){
    }

    public ResultSet getResulSet(String sqlSelect, String... params) throws Exception {
        PreparedStatement ps = conn.prepareStatement(sqlSelect);
        int paramsCount = 0;
        for (String param : params) {
            paramsCount++;
            ps.setString(paramsCount, param);
        }
        return ps.executeQuery();
    }
    
    public ResultSet getAllFromTable(String tableName) throws Exception {
        String sql = "Select * from " + tableName;
        return getResulSet(sql);
    }
    
  

    public void CreateXML() throws SQLException{
        try {
            ResultSet rs = getResulSet("select * from ContractsLocal where MaDaiLy = '"+Instance.MaDL+"'");
            
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element root = doc.createElement("root");
            doc.appendChild(root);
            
            while(rs.next()){
                Element Contract = doc.createElement("ContractLocal");
                root.appendChild(Contract);
                Element nextElement;
               
                for (String data : Instance.data) {
                    nextElement = doc.createElement(data);
                    String s = rs.getString(data);
                    if(s == null)
                        s= "";
                    nextElement.appendChild(doc.createTextNode(s));
                    Contract.appendChild(nextElement);
                }
            }
            
            // write the content into xml file
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            
            DOMSource source = new DOMSource(doc);
            String fileName = "client\\Data_"+Instance.MaDL+".xml";
            StreamResult result = new StreamResult(new File(fileName));

            transformer.transform(source, result);

            executeSQLwithParams("delete from ContractsLocal where MaDaiLy = '"+Instance.MaDL+"'",MODE_UPDATE.SMALL_UPDATE);
            
            System.out.println("File saved!");
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public void CreateLocalContracts() throws Exception{
            new DataAccessObject().CreateXML();
    }

    public void ReadFileXMLAndUpdate(){
        try {
            File fXmlFile = new File("Server\\AllData.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            //optional, but recommended
            doc.getDocumentElement().normalize();

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("Contract");

            System.out.println("----------------------------");
            HopDong[] h = new HopDong[ nList.getLength()];
            
            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println("SoHopDong : "+h.length+" " + eElement.getElementsByTagName("SoHopDong").item(0).getTextContent());
                    System.out.println("MaKhachHang : " + eElement.getElementsByTagName("MaKhachHang").item(0).getTextContent());
                    System.out.println("MaDaiLy : " + eElement.getElementsByTagName("MaDaiLy").item(0).getTextContent());
                    System.out.println("NgayDKHopDong : " + eElement.getElementsByTagName("NgayDKHopDong").item(0).getTextContent());
                    h[temp] = new HopDong();
                    h[temp].SoHopDong= eElement.getElementsByTagName("SoHopDong").item(0).getTextContent();
                    h[temp].MaKhachHang=   eElement.getElementsByTagName("MaKhachHang").item(0).getTextContent();
                    h[temp].MaDaiLy =   eElement.getElementsByTagName("MaDaiLy").item(0).getTextContent();
                    h[temp].NgayDKHopDong=   eElement.getElementsByTagName("NgayDKHopDong").item(0).getTextContent();
                    h[temp].DiaDiemDKHopDong =     eElement.getElementsByTagName("DiaDiemDKHopDong").item(0).getTextContent();
                    h[temp].TenKhachHang =     eElement.getElementsByTagName("TenKhachHang").item(0).getTextContent();
                    h[temp].NguoiDaiDien=    eElement.getElementsByTagName("NguoiDaiDien").item(0).getTextContent();
                    h[temp].ChucVu =   eElement.getElementsByTagName("ChucVu").item(0).getTextContent();
                    h[temp].NgaySinh = eElement.getElementsByTagName("NgaySinh").item(0).getTextContent();
                    h[temp].GioiTinh =     eElement.getElementsByTagName("GioiTinh").item(0).getTextContent();
                    h[temp].CMND =    eElement.getElementsByTagName("CMND").item(0).getTextContent();
                    h[temp].NoiCapCMND =   eElement.getElementsByTagName("NoiCapCMND").item(0).getTextContent();
                    h[temp].NgayCapCMND =   eElement.getElementsByTagName("NgayCapCMND").item(0).getTextContent();
                    h[temp].SoHoKhau =    eElement.getElementsByTagName("SoHoKhau").item(0).getTextContent();
                    h[temp].NoiCapSoHoKhau =   eElement.getElementsByTagName("NoiCapSoHoKhau").item(0).getTextContent();
                    h[temp].NgayCapSoHoKhau=   eElement.getElementsByTagName("NgayCapSoHoKhau").item(0).getTextContent();
                    h[temp].SoGiayChungNhanDKDN=     eElement.getElementsByTagName("SoGiayChungNhanDKDN").item(0).getTextContent();
                    h[temp].NoiCapDKDN =   eElement.getElementsByTagName("NoiCapDKDN").item(0).getTextContent();
                    h[temp].NgayCapDKDN=   eElement.getElementsByTagName("NgayCapDKDN").item(0).getTextContent();
                    h[temp].SoNha =   eElement.getElementsByTagName("SoNha").item(0).getTextContent();
                    h[temp].Duong =    eElement.getElementsByTagName("Duong").item(0).getTextContent();
                    h[temp].xTo =    eElement.getElementsByTagName("xTo").item(0).getTextContent();
                    h[temp].PhuongXa =    eElement.getElementsByTagName("PhuongXa").item(0).getTextContent();
                    h[temp].QuanHuyen=   eElement.getElementsByTagName("QuanHuyen").item(0).getTextContent();
                    h[temp].TinhTp =   eElement.getElementsByTagName("TinhTp").item(0).getTextContent();
                    h[temp].SDTKhachHang =    eElement.getElementsByTagName("SDTKhachHang").item(0).getTextContent();
                    h[temp].Email =     eElement.getElementsByTagName("Email").item(0).getTextContent();
                    h[temp].MaSoThueKhachHang =   eElement.getElementsByTagName("MaSoThueKhachHang").item(0).getTextContent();
                    h[temp].NhanBaoCuoc =eElement.getElementsByTagName("NhanBaoCuoc").item(0).getTextContent();
                    h[temp].NhanBaoCuocKhac = eElement.getElementsByTagName("NhanBaoCuocKhac").item(0).getTextContent();
                    h[temp].NhanBanKe = eElement.getElementsByTagName("NhanBanKe").item(0).getTextContent();
                    h[temp].NhanBanKeKhac = eElement.getElementsByTagName("NhanBanKeKhac").item(0).getTextContent();
                    h[temp].ThanhToan = eElement.getElementsByTagName("ThanhToan").item(0).getTextContent();
                    h[temp].ThanhToanKhac = eElement.getElementsByTagName("ThanhToanKhac").item(0).getTextContent();
                    h[temp].EmailNhanBaoCuoc = eElement.getElementsByTagName("EmailNhanBaoCuoc").item(0).getTextContent();
                    h[temp].SDTNhanBaoCuoc = eElement.getElementsByTagName("SDTNhanBaoCuoc").item(0).getTextContent();
                    h[temp].SoTaiKhoanThanhToan = eElement.getElementsByTagName("SoTaiKhoanThanhToan").item(0).getTextContent();
                    h[temp].NganHang = eElement.getElementsByTagName("NganHang").item(0).getTextContent();
                    h[temp].ChiNhanh = eElement.getElementsByTagName("ChiNhanh").item(0).getTextContent();
                }
            }
            
            executeSQLwithParams("Drop table Contracts",MODE_UPDATE.SMALL_UPDATE);
            executeSQLwithParams("CREATE TABLE Contracts (\n" +
                                "  id int NOT NULL primary key identity(1,1),\n" +
                                "  SoHopDong varchar(255) DEFAULT NULL,\n" +
                                "  MaKhachHang varchar(255) DEFAULT NULL,\n" +
                                "  MaDaiLy varchar(255) DEFAULT NULL,\n" +
                                "  NgayDKHopDong varchar(255) DEFAULT NULL,\n" +
                                "  DiaDiemDKHopDong varchar(255) DEFAULT NULL,\n" +
                                "  TenKhachHang varchar(255) DEFAULT NULL,\n" +
                                "  NguoiDaiDien varchar(255) DEFAULT NULL,\n" +
                                "  ChucVu varchar(255) DEFAULT NULL,\n" +
                                "  NgaySinh varchar(255) DEFAULT NULL,\n" +
                                "  GioiTinh varchar(255) DEFAULT NULL,\n" +
                                "  CMND varchar(13) DEFAULT NULL,\n" +
                                "  NoiCapCMND varchar(255) DEFAULT NULL,\n" +
                                "  NgayCapCMND varchar(255) DEFAULT NULL,\n" +
                                "  SoHoKhau varchar(255) DEFAULT NULL,\n" +
                                "  NoiCapSoHoKhau varchar(255) DEFAULT NULL,\n" +
                                "  NgayCapSoHoKhau varchar(255) DEFAULT NULL,\n" +
                                "  SoGiayChungNhanDKDN varchar(255) DEFAULT NULL,\n" +
                                "  NoiCapDKDN varchar(255) DEFAULT NULL,\n" +
                                "  NgayCapDKDN varchar(255) DEFAULT NULL,\n" +
                                "  SoNha varchar(255) DEFAULT NULL,\n" +
                                "  Duong varchar(255) DEFAULT NULL,\n" +
                                "  xTo varchar(255) DEFAULT NULL,\n" +
                                "  PhuongXa varchar(255) DEFAULT NULL,\n" +
                                "  QuanHuyen varchar(255) DEFAULT NULL,\n" +
                                "  TinhTp varchar(255) DEFAULT NULL,\n" +
                                "  SDTKhachHang varchar(100) DEFAULT NULL,\n" +
                                "  Email varchar(255) DEFAULT NULL,\n" +
                                "  MaSoThueKhachHang varchar(255) DEFAULT NULL,\n" +
                                "  DichVuID varchar(255) DEFAULT NULL,\n" +
                                "  NhanBaoCuoc varchar(255) DEFAULT NULL,\n" +
                                "  NhanBaoCuocKhac varchar(255) DEFAULT NULL,\n" +
                                "  NhanBanKe varchar(255) DEFAULT NULL,\n" +
                                "  NhanBanKeKhac varchar(255) DEFAULT NULL,\n" +
                                "  EmailNhanBaoCuoc varchar(255) DEFAULT NULL,\n" +
                                "  SDTNhanBaoCuoc varchar(100) DEFAULT NULL,\n" +
                                "  ThanhToan varchar(255) DEFAULT NULL,\n" +
                                "  ThanhToanKhac varchar(255) DEFAULT NULL,\n" +
                                "  SoTaiKhoanThanhToan varchar(255) DEFAULT NULL,\n" +
                                "  NganHang varchar(255) DEFAULT NULL,\n" +
                                "  ChiNhanh varchar(255) DEFAULT NULL\n" +
                                ") ",MODE_UPDATE.SMALL_UPDATE);
            
            
            for(int i = 0; i < h.length; i++){
                String action = "Insert";
                
                String sql = action+" into Contracts (SoHopDong, MaKhachHang, MaDaiLy, NgayDKHopDong, DiaDiemDKHopDong,"
                    + " TenKhachHang, NguoiDaiDien, ChucVu, NgaySinh, GioiTinh, CMND, NoiCapCMND, NgayCapCMND, SoHoKhau,"
                    + " NoiCapSoHoKhau, NgayCapSoHoKhau, SoGiayChungNhanDKDN, NoiCapDKDN, NgayCapDKDN, SoNha, Duong, xTo,"
                    + " PhuongXa, QuanHuyen, TinhTp, SDTKhachHang, Email, MaSoThueKhachHang, DichVuID, NhanBaoCuoc,"
                    + " NhanBaoCuocKhac, NhanBanKe, NhanBanKeKhac, EmailNhanBaoCuoc, SDTNhanBaoCuoc, ThanhToan, "
                    + "ThanhToanKhac, SoTaiKhoanThanhToan, NganHang, ChiNhanh)"
                    + " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
                executeSQLwithParams(sql, DataAccessObject.MODE_UPDATE.SMALL_UPDATE,
                        h[i].SoHopDong, h[i].MaKhachHang, h[i].MaDaiLy, h[i].NgayDKHopDong, h[i].DiaDiemDKHopDong,
                        h[i].TenKhachHang, h[i].NguoiDaiDien, h[i].ChucVu, h[i].NgaySinh, h[i].GioiTinh, h[i].CMND, h[i].NoiCapCMND, h[i].NgayCapCMND, h[i].SoHoKhau,
                        h[i].NoiCapSoHoKhau, h[i].NgayCapSoHoKhau, h[i].SoGiayChungNhanDKDN, h[i].NoiCapDKDN, h[i].NgayCapDKDN, h[i].SoNha, h[i].Duong, h[i].xTo,
                        h[i].PhuongXa, h[i].QuanHuyen, h[i].TinhTp, h[i].SDTKhachHang, h[i].Email, h[i].MaSoThueKhachHang, h[i].DichVuID, h[i].NhanBaoCuoc,
                        h[i].NhanBaoCuocKhac, h[i].NhanBanKe, h[i].NhanBanKeKhac, h[i].EmailNhanBaoCuoc, h[i].SDTNhanBaoCuoc, h[i].ThanhToan,
                        h[i].ThanhToanKhac, h[i].SoTaiKhoanThanhToan, h[i].NganHang, h[i].ChiNhanh
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws Exception {
//        new DataAccessObject().CreateXML();

        new DataAccessObject().ReadFileXMLAndUpdate();
    }
}
