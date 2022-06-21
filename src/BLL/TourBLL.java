
package BLL;

import DAL.TourDAL;
import DTO.TourDTO;
import java.util.ArrayList;


public class TourBLL {
    public static ArrayList<TourDTO> loadDataTour() {
        TourDAL t = new TourDAL();
        return t.loadDataTour();
    }      
    public static void addTour(TourDTO t) {
        TourDAL.addTour(t);
    }      
    public static void editTour(TourDTO t,String data) {          
        TourDAL.editTour(t, data);
    }
    public static void removeTour(String matour) {
        TourDAL.removeTour(matour);
    } 
}
