/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author HUYNHVIETBINH
 */
public class ChiPhiDTO {
    private String maCP;
    private String maDoan;
    private int tongCP;
    private String chiTiet;

    
    public ChiPhiDTO(String maCP, String maDoan, int tongCP, String chiTiet) {
        this.maCP = maCP;
        this.maDoan = maDoan;
        this.tongCP = tongCP;
        this.chiTiet = chiTiet;
    }

    public ChiPhiDTO() {
    }
    
    public String getMaCP() {
        return maCP;
    }

    public void setMaCP(String maCP) {
        this.maCP = maCP;
    }

    public String getMaDoan() {
        return maDoan;
    }

    public void setMaDoan(String maDoan) {
        this.maDoan = maDoan;
    }

    public int getTongCP() {
        return tongCP;
    }

    public void setTongCP(int tongCP) {
        this.tongCP = tongCP;
    }

    public String getChiTiet() {
        return chiTiet;
    }

    public void setChiTiet(String chiTiet) {
        this.chiTiet = chiTiet;
    }
    public static void main(String[] args) {
        ChiPhiDTO cp = new ChiPhiDTO();
        cp.setMaCP("ad");
        cp.setMaDoan("DC01");
        cp.setTongCP(12);
        cp.setChiTiet("sdf");
        System.out.println(cp);    
    }
}
