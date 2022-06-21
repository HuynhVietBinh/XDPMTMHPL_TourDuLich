/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.KhachHangDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vo Duy Kiet
 */
public class KhachHangDAL {

    private static Statement st = null;
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public ArrayList<KhachHangDTO> loadDataKhachHang() {
        ArrayList<KhachHangDTO> khList = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM khachhang";
            ps = new MySQLConnect().conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangDTO kh = new KhachHangDTO(rs.getString("makh"), rs.getString("madoan"), 
                        rs.getString("tenkh"), rs.getString("sdt"), rs.getString("ngaysinh"),rs.getString("email"));
                khList.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return khList;
    }

    public static void addKhachHang(KhachHangDTO kh) {
        MySQLConnect Connect = new MySQLConnect();
        try {
            String query = "insert into khachhang values('";
            query += kh.getMakh() + "','" + kh.getMadoan() + "','" + kh.getTenkh() + "','"
                    + kh.getSdt() + "','" + kh.getNgaysinh() + "','" + kh.getEmail() + "')";
            Connect.st = Connect.conn.createStatement();
            Connect.st.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e);
        }
        Connect.MySQLDisconnect();

    }

    public static void editKhachHang(KhachHangDTO kh) {
        String query = "UPDATE khachhang SET madoan=?, tenkh=?,sdt=?,ngaysinh=?,email=? WHERE makh=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(6, kh.getMakh());
            ps.setString(1, kh.getMadoan());
            ps.setString(2, kh.getTenkh());
            ps.setString(3, kh.getSdt());
            ps.setString(4, kh.getNgaysinh());
            ps.setString(5, kh.getEmail());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeKhachHang(String kh) {
        String query = "DELETE FROM khachhang WHERE makh=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, kh);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
