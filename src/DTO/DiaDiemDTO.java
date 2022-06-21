/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import javax.swing.JTextField;
import javax.swing.JTextPane;

/**
 *
 * @author Admin
 */
public class DiaDiemDTO {
    String madd, thanhpho, tendd, mota;
    public String getMadd() {
        return madd;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public String getTendd() {
        return tendd;
    }

    public String getMota() {
        return mota;
    }

    public void setMadd(String madd) {
        this.madd = madd;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public void setTendd(String tendd) {
        this.tendd = tendd;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public DiaDiemDTO() {
    }

    public DiaDiemDTO(String madd, String thanhpho, String tendd, String mota) {
        this.madd = madd;
        this.thanhpho = thanhpho;
        this.tendd = tendd;
        this.mota = mota;
    }
    
}
