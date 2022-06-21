/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.KhachHangDAL;
import DTO.KhachHangDTO;
import java.util.ArrayList;

/**
 *
 * @author HUYNHVIETBINH
 */
public class KhachHangBLL {
    public ArrayList<KhachHangDTO> loadDataKhachHang(){
        KhachHangDAL kh = new KhachHangDAL();
        return kh.loadDataKhachHang();
    }
    public static void addKhachHang(KhachHangDTO kh){
        KhachHangDAL.addKhachHang(kh);
    }
    public static void editKhachHang(KhachHangDTO kh){
        KhachHangDAL.editKhachHang(kh);
    }
    public static void removeKhachHang(String makh){
        KhachHangDAL.removeKhachHang(makh);
    }
}
