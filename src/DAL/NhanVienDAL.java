/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.NhanVienDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienDAL {

    public ArrayList<NhanVienDTO> loadDataNhanVien() {
        MySQLConnect connect = new MySQLConnect();
        Statement statement;
        ArrayList<NhanVienDTO> DSNhanVien = new ArrayList<>();
        try {
            String sql = "select * from nhanvien";
            statement = connect.conn.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                NhanVienDTO nv = new NhanVienDTO(rs.getString("manv"),
                        rs.getString("madoan"), rs.getString("tennv"), rs.getString("sdt"),
                        rs.getString("ngaysinh"), rs.getString("email"), rs.getString("nhiemvu"));
                DSNhanVien.add(nv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.MySQLDisconnect();
        return DSNhanVien;
    }

    public static void addNhanVien(NhanVienDTO nv) {
        MySQLConnect connect = new MySQLConnect();
        try{
           String sql = "insert into nhanvien value('";
           sql += nv.getManv()+"','"+nv.getMadoan()+"','"+nv.getTennv()+"','"+nv.getSdt()+"','"+nv.getNgaysinh()+"','"+nv.getEmail()+"','"+nv.getNhiemvu()+"')";
           connect.st = connect.conn.createStatement();
           connect.st.executeUpdate(sql);        
        }catch(SQLException ex){
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);  
        }   
        connect.MySQLDisconnect();
    }

    public static void editNhanVien(NhanVienDTO nv, String data) {
        MySQLConnect connect = new MySQLConnect();
        PreparedStatement ps;
        String query = "update nhanvien set madoan=?, tennv=?, sdt=? , ngaysinh=?, email=?, nhiemvu=? where manv=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, nv.getMadoan());
            ps.setString(2, nv.getTennv());
            ps.setString(3, nv.getSdt());
            ps.setString(4, nv.getNgaysinh());
            ps.setString(5, nv.getEmail());
            ps.setString(6, nv.getNhiemvu());
            ps.setString(7, data);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        connect.MySQLDisconnect();
    }

    public static void removeNhanVien(String manv) {
        MySQLConnect connect = new MySQLConnect();
        try {
            String sql = "delete from nhanvien where manv='" + manv + "'";
            connect.st = connect.conn.createStatement();
            connect.st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.MySQLDisconnect();
    }
}
