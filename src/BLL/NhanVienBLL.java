package BLL;

import DAL.NhanVienDAL;
import DTO.NhanVienDTO;
import java.util.ArrayList;

public class NhanVienBLL {

    public static ArrayList<NhanVienDTO> loadDataNhanVien() {
        NhanVienDAL nv = new NhanVienDAL();
        return nv.loadDataNhanVien();
    }

    public static void addNhanVien(NhanVienDTO nv) {
        NhanVienDAL.addNhanVien(nv);
    }

    public static void editNhanVien(NhanVienDTO nv, String data) {
        NhanVienDAL.editNhanVien(nv, data);
    }

    public static void removeNhanVien(String manv) {
        NhanVienDAL.removeNhanVien(manv);
    }

}
