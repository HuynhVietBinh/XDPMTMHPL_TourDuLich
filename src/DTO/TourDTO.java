/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.Date;

/**
 *
 * @author Vo Duy Kiet
 */
public class TourDTO {

    String matour, tentour, diemdulich, mota, xuatphat;

    public TourDTO(String matour, String tentour, String text, String mota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getDiemdulich() {
        return diemdulich;
    }

    public void setDiemdulich(String diemdulich) {
        this.diemdulich = diemdulich;
    }

    public String getXuatphat() {
        return xuatphat;
    }

    public void setXuatphat(String xuatphat) {
        this.xuatphat = xuatphat;
    }

    public TourDTO() {
        
    }
    
    public TourDTO(String matour, String tentour, String diemdulich, String xuatphat, String mota) {
        this.matour = matour;
        this.tentour = tentour;
        this.diemdulich = diemdulich;
        this.xuatphat = xuatphat;
        this.mota = mota;
    }

    public String getMatour() {
        return matour;
    }

    public String getTentour() {
        return tentour;
    }

    public String getMota() {
        return mota;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public void setTentour(String tentour) {
        this.tentour = tentour;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    


   
    

}
