/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Admin
 */
public class GiaDTO {

    String magia, matour, tungay, denngay;
    int sotien, songay;

    public GiaDTO() {
    }

    public GiaDTO(String magia, String matour, int sotien, String tungay, String denngay, int songay) {
        this.magia = magia;
        this.matour = matour;
        this.sotien = sotien;
        this.tungay = tungay;
        this.denngay = denngay;
        this.songay = songay;
    }

    public String getMagia() {
        return magia;
    }

    public int getSotien() {
        return sotien;
    }

    public String getDenngay() {
        return denngay;
    }

    public void setDenngay(String denngay) {
        this.denngay = denngay;
    }

    public String getTungay() {
        return tungay;
    }

    public void setTungay(String tungay) {
        this.tungay = tungay;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }

    public String getMatour() {
        return matour;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public void setSotien(int sotien) {
        this.sotien = sotien;
    }

    public int getSongay() {
        return songay;
    }

    public void setSongay(int songay) {
        this.songay = songay;
    }

}
