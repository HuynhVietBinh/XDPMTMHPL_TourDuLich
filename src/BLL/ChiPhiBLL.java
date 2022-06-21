/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChiPhiDAL;
import DTO.ChiPhiDTO;
import java.util.ArrayList;

/**
 *
 * @author HUYNHVIETBINH
 */
public class ChiPhiBLL {
    
    public ArrayList<ChiPhiDTO> loadDataChiPhi() {
        ChiPhiDAL chiphi = new ChiPhiDAL();
        return chiphi.loadDataChiPhi();
    }
    public static void addChiPhi(ChiPhiDTO cp) {
        ChiPhiDAL.addChiPhi(cp);
    }
    public static void editChiPhi(ChiPhiDTO cp) {
        ChiPhiDAL.editChiPhi(cp);
    }
    public static void removeChiPhi(String macp) {
        ChiPhiDAL.removeChiPhi(macp);
    }
}
