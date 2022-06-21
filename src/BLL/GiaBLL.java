/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.GiaDAL;
import DTO.GiaDTO;
import java.util.ArrayList;

/**
 *
 * @author HUYNHVIETBINH
 */
public class GiaBLL {

    public static ArrayList<GiaDTO> loadDataGia() {
        return new GiaDAL().loadDataGia();
    }

    public static boolean addGia(GiaDTO g) {
        return new GiaDAL().addGia(g);
    }

    public static boolean editGia(GiaDTO g, String data) {
        return new GiaDAL().editGia(g, data);
    }

    public static boolean removeGia(GiaDTO g, String data) {
        return new GiaDAL().removeGia(g, data);
    }

}
