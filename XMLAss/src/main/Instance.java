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
    
    
    public static String[] dataShow = {"So Hop Dong","Ma Khach Hang","Ma Dai Ly","Ngay DK Hop Dong","Dia Diem DK Hop Dong",
                    "Ten Khach Hang","Nguoi Dai Dien","Chuc Vu","Ngay Sinh","Gioi Tinh","CMND","Noi Cap CMND","Ngay Cap CMND","So Ho Khau",
                    "Noi Cap SHK","Ngay Cap SHK","So Giay Chung Nhan DKDN","Noi Cap DKDN","Ngay Cap DKDN","So Nha","Duong","To",
                    "Phuong Xa","Quan Huyen","Tinh Tp","SDT Khach Hang","Email","MST Khach Hang","Dich Vu","Nhan Bao Cuoc",
                    "NhanBaoCuocKhac","NhanBanKe","NhanBanKeKhac","EmailNhanBaoCuoc","SDTNhanBaoCuoc","ThanhToan",
                    "Thanh Toan Khac","So Tai Khoan Thanh Toan","Ngan Hang","Chi Nhanh"};
    
    private static Instance i;
    public static String idContract = "-1";
    public static String MaDL= "DL001";
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
