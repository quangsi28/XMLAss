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
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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
    
//    public ResultSet getResulSet(String sqlSelect) throws Exception {
//        PreparedStatement ps = conn.prepareStatement(sqlSelect);
//            
//        return ps.executeQuery();
//    }

    public ResultSet getAllFromTable(String tableName) throws Exception {
        String sql = "Select * from " + tableName;
        return getResulSet(sql);
    }
    
    public void CreateXMLData(ResultSet rs){
        String result = "";
        try {
            result = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n <root>\n";
            
            while(rs.next()){
                result += "<Contract>\n";
                result += "<SoHopDong>\n";
                result += rs.getString("SoHopDong")+"\n";
                result += "</SoHopDong>\n";
                
                result += "<MaKhachHang>\n";
                result += rs.getString("MaKhachHang")+"\n";
                result += "</MaKhachHang>\n";
                
                result += "<MaDaiLy>\n";
                result += rs.getString("MaDaiLy")+"\n";
                result += "</MaDaiLy>\n";
                
                result += "<NgayDKHopDong>\n";
                result += rs.getString("NgayDKHopDong")+"\n";
                result += "</NgayDKHopDong>\n";
                
                result += "<DiaDiemDKHopDong>\n";
                result += rs.getString("DiaDiemDKHopDong")+"\n";
                result += "</DiaDiemDKHopDong>\n";
                
                result += "<TenKhachHang>\n";
                result += rs.getString("TenKhachHang")+"\n";
                result += "</TenKhachHang>\n";
                
                result += "<NguoiDaiDien>\n";
                result += rs.getString("NguoiDaiDien")+"\n";
                result += "</NguoiDaiDien>\n";
                
                result += "<ChucVu>\n";
                result += rs.getString("ChucVu")+"\n";
                result += "</ChucVu>\n";
                
                result += "<NgaySinh>\n";
                result += rs.getString("NgaySinh")+"\n";
                result += "</NgaySinh>\n";
                
                result += "<GioiTinh>\n";
                result += rs.getString("GioiTinh")+"\n";
                result += "</GioiTinh>\n";
                
                result += "<CMND>\n";
                result += rs.getString("CMND")+"\n";
                result += "</CMND>\n";
                
                result += "<NoiCapCMND>\n";
                result += rs.getString("NoiCapCMND")+"\n";
                result += "</NoiCapCMND>\n";
                
                result += "<NgayCapCMND>\n";
                result += rs.getString("NgayCapCMND")+"\n";
                result += "</NgayCapCMND>\n";
                
                result += "<SoHoKhau>\n";
                result += rs.getString("SoHoKhau")+"\n";
                result += "</SoHoKhau>\n";
                
                result += "<NoiCapSoHoKhau>\n";
                result += rs.getString("NoiCapSoHoKhau")+"\n";
                result += "</NoiCapSoHoKhau>\n";
                
                result += "<NgayCapSoHoKhau>\n";
                result += rs.getString("NgayCapSoHoKhau")+"\n";
                result += "</NgayCapSoHoKhau>\n";
                
                result += "<SoGiayChungNhanDKDN>\n";
                result += rs.getString("SoGiayChungNhanDKDN")+"\n";
                result += "</SoGiayChungNhanDKDN>\n";
                
                result += "<NoiCapDKDN>\n";
                result += rs.getString("NoiCapDKDN")+"\n";
                result += "</NoiCapDKDN>\n";
                
                result += "<NgayCapDKDN>\n";
                result += rs.getString("NgayCapDKDN")+"\n";
                result += "</NgayCapDKDN>\n";
                
                result += "<SoNha>\n";
                result += rs.getString("SoNha")+"\n";
                result += "</SoNha>\n";
                
                result += "<Duong>\n";
                result += rs.getString("Duong")+"\n";
                result += "</Duong>\n";
                
                result += "<xTo>\n";
                result += rs.getString("xTo")+"\n";
                result += "</xTo>\n";
                
                result += "<PhuongXa>\n";
                result += rs.getString("PhuongXa")+"\n";
                result += "</PhuongXa>\n";
                
                result += "<QuanHuyen>\n";
                result += rs.getString("QuanHuyen")+"\n";
                result += "</QuanHuyen>\n";
                
                result += "<TinhTp>\n";
                result += rs.getString("TinhTp")+"\n";
                result += "</TinhTp>\n";
                
                result += "<SDTKhachHang>\n";
                result += rs.getString("SDTKhachHang")+"\n";
                result += "</SDTKhachHang>\n";
                
                
                result += "<Email>\n";
                result += rs.getString("Email")+"\n";
                result += "</Email>\n";
                
                result += "<MaSoThueKhachHang>\n";
                result += rs.getString("MaSoThueKhachHang")+"\n";
                result += "</MaSoThueKhachHang>\n";
                
                result += "<DichVuID>\n";
                result += rs.getString("DichVuID")+"\n";
                result += "</DichVuID>\n";
                
                result += "<NhanBaoCuoc>\n";
                result += rs.getString("NhanBaoCuoc")+"\n";
                result += "</NhanBaoCuoc>\n";
                
                result += "<NhanBaoCuocKhac>\n";
                result += rs.getString("NhanBaoCuocKhac")+"\n";
                result += "</NhanBaoCuocKhac>\n";
                
                result += "<NhanBanKe>\n";
                result += rs.getString("NhanBanKe")+"\n";
                result += "</NhanBanKe>\n";
                
                result += "<NhanBanKeKhac>\n";
                result += rs.getString("NhanBanKeKhac")+"\n";
                result += "</NhanBanKeKhac>\n";
                
                result += "<EmailNhanBaoCuoc>\n";
                result += rs.getString("EmailNhanBaoCuoc")+"\n";
                result += "</EmailNhanBaoCuoc>\n";
                
                result += "<SDTNhanBaoCuoc>\n";
                result += rs.getString("SDTNhanBaoCuoc")+"\n";
                result += "</SDTNhanBaoCuoc>\n";
                
                result += "<ThanhToan>\n";
                result += rs.getString("ThanhToan")+"\n";
                result += "</ThanhToan>\n";
                
                result += "<ThanhToanKhac>\n";
                result += rs.getString("ThanhToanKhac")+"\n";
                result += "</ThanhToanKhac>\n";
                
                result += "<SoTaiKhoanThanhToan>\n";
                result += rs.getString("SoTaiKhoanThanhToan")+"\n";
                result += "</SoTaiKhoanThanhToan>\n";
                
                result += "<NganHang>\n";
                result += rs.getString("NganHang")+"\n";
                result += "</NganHang>\n";
                
                result += "<ChiNhanh>\n";
                result += rs.getString("ChiNhanh")+"\n";
                result += "</ChiNhanh>\n";
                
                result += "<xStatus>\n";
                result += rs.getString("xStatus")+"\n";
                result += "</xStatus>\n";
                
                result += "</Contract>\n";
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            result += "</root>\n";
            
            try {
                PrintWriter out = new PrintWriter("E:\\Learn\\XML\\assxml\\XMLAss\\src\\db\\dataClient.txt");
                out.print(result);
                out.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    public void CreateXML(ResultSet rs) throws SQLException{
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            ResultSetMetaData rsmd = rs.getMetaData();
		// root elements
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element root = doc.createElement("root");
            doc.appendChild(root);
            
            while(rs.next()){
                Element Contract = doc.createElement("Contract");
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
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\fileXMLNew.xml"));

            transformer.transform(source, result);

            System.out.println("File saved!");
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerConfigurationException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } catch (TransformerException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    private void SetChild(Document d, Element Contract, String name, ResultSet rs){
        try {
            Element need =d.createElement(name);
            need.appendChild(d.createTextNode(rs.getString(name)));
            Contract.appendChild(need);
            System.out.println(rs.getString(name));

        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args) throws Exception {
        ResultSet rs = new DataAccessObject().getAllFromTable("ContractsLocal");
//        new DataAccessObject().CreateXMLData(rs);

        new DataAccessObject().CreateXML(rs);
        
    }
}
