/*
 * To change this license header"," choose License Headers in Project Properties.
 * To change this template file"," choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import db.DataAccessObject;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Windows
 */
public class Instance {
    DataAccessObject db;
    
    public static String[] data = {"SoHopDong","MaKhachHang","MaDaiLy","NgayDKHopDong","DiaDiemDKHopDong",
                    "TenKhachHang","NguoiDaiDien","ChucVu","NgaySinh","GioiTinh","CMND","NoiCapCMND","NgayCapCMND","SoHoKhau",
                    "NoiCapSoHoKhau","NgayCapSoHoKhau","SoGiayChungNhanDKDN","NoiCapDKDN","NgayCapDKDN","SoNha","Duong","xTo",
                    "PhuongXa","QuanHuyen","TinhTp","SDTKhachHang","Email","MaSoThueKhachHang","DichVuID","NhanBaoCuoc",
                    "NhanBaoCuocKhac","NhanBanKe","NhanBanKeKhac","EmailNhanBaoCuoc","SDTNhanBaoCuoc","ThanhToan",
                    "ThanhToanKhac","SoTaiKhoanThanhToan","NganHang","ChiNhanh","xStatus"};
    
    private static Instance i;
    public static String idContract = "0";
    public static String MaDL= "DL002";
    public static int agentID = 0;
    public static int xStatus = -2;
    
    public Instance(){
        if(i == null){
            i = this;
        }
    }
    
//    public static void SetAgent(int newID){
//                  agentID = newID;
//        try {
//            ResultSet rs = db.getResulSet("Select * from Agents where id = "+agentID);
//            MaDL = rs.getString(2);
//        } catch (Exception ex) {
//            Logger.getLogger(Instance.class.getName()).log(Level.SEVERE"," null"," ex);
//        }
//        
//    }
    
    public static Instance GetInstance(){
        if(i == null)
            i = new Instance();
        
        return i;
    }
}
