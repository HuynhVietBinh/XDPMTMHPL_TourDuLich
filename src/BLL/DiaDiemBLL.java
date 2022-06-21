/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author Admin
 */

import DAL.DiaDiemDAL;
import DTO.DiaDiemDTO;
import java.util.ArrayList;


public class DiaDiemBLL {
    
    public static ArrayList<DiaDiemDTO> loadDataDiaDiem() {
        DiaDiemDAL dd = new DiaDiemDAL();
        return dd.loadDataDiaDiem();
    }      
    public static void addDiaDiem(DiaDiemDTO dd) {
        DiaDiemDAL.addDiaDiem(dd);
    }      
    public static void editDiaDiem(DiaDiemDTO dd,String data) {          
        DiaDiemDAL.editDiaDiem(dd, data);
    }
    public static void removeDiaDiem(String madd) {
        DiaDiemDAL.removeDiaDiem(madd);
    } 
}


