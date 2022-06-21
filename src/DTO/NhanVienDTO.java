/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Win 10
 */
public class NhanVienDTO {

    String manv, madoan, tennv, sdt, ngaysinh, email, nhiemvu;

    public NhanVienDTO() {
    }

    public NhanVienDTO(String manv, String madoan, String tennv, String sdt, String ngaysinh, String email, String nhiemvu) {
        this.manv = manv;
        this.madoan = madoan;
        this.tennv = tennv;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
        this.email = email;
        this.nhiemvu = nhiemvu;
    }

    public String getManv() {
        return manv;
    }

    public String getTennv() {
        return tennv;
    }

    public String getMadoan() {
        return madoan;
    }

    public void setMadoan(String madoan) {
        this.madoan = madoan;
    }

    public String getSdt() {
        return sdt;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getEmail() {
        return email;
    }

    public String getNhiemvu() {
        return nhiemvu;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNhiemvu(String nhiemvu) {
        this.nhiemvu = nhiemvu;
    }

}
