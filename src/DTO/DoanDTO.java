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
public class DoanDTO {

    String madoan, matour, tendoan, ngaydi, ngayve, chitietchuongtrinh;

    public DoanDTO(String madoan, String matour, String tendoan, String ngaydi, String ngayve, String chitietchuongtrinh) {
        this.madoan = madoan;
        this.matour = matour;
        this.tendoan = tendoan;
        this.ngaydi = ngaydi;
        this.ngayve = ngayve;
        this.chitietchuongtrinh = chitietchuongtrinh;
    }

    public DoanDTO() {
        
    }

    public String getMadoan() {
        return madoan;
    }

    public String getMatour() {
        return matour;
    }

    public String getTendoan() {
        return tendoan;
    }

    public String getNgaydi() {
        return ngaydi;
    }

    public String getNgayve() {
        return ngayve;
    }

    public String getChitietchuongtrinh() {
        return chitietchuongtrinh;
    }

    public void setMadoan(String madoan) {
        this.madoan = madoan;
    }

    public void setMatour(String matour) {
        this.matour = matour;
    }

    public void setTendoan(String tendoan) {
        this.tendoan = tendoan;
    }

    public void setNgaydi(String ngaydi) {
        this.ngaydi = ngaydi;
    }

    public void setNgayve(String ngayve) {
        this.ngayve = ngayve;
    }

    public void setChitietchuongtrinh(String chitietchuongtrinh) {
        this.chitietchuongtrinh = chitietchuongtrinh;
    }

}
