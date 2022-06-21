/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DoanDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HUYNHVIETBINH
 */
public class DoanDAL {
    public static PreparedStatement ps;
    public static ResultSet rs;
    public static Statement statement;

    public ArrayList<DoanDTO> loadDataDoan() {
        ArrayList<DoanDTO> dList = new ArrayList<>();
        MySQLConnect connect = new MySQLConnect();
        try {
            String query = "SELECT * FROM doan";
            ps = new MySQLConnect().conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DoanDTO d = new DoanDTO(rs.getString("madoan"),
                        rs.getString("matour"), rs.getString("tendoan"), rs.getString("ngaydi"),
                        rs.getString("ngayve"), rs.getString("chitietchuongtrinh"));
                dList.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoanDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.MySQLDisconnect();
        return dList;
    }
    public static void addDoan(DoanDTO d) {    
        MySQLConnect connect = new MySQLConnect();
        try{
           String sql = "insert into doan value('";
           sql += d.getMadoan()+"','"+d.getMatour()+"','"+d.getTendoan()+"','"+d.getNgaydi()+"','"+d.getNgayve()+"','"+d.getChitietchuongtrinh()+"')";
           connect.st = connect.conn.createStatement();
           connect.st.executeUpdate(sql);        
        }catch(SQLException ex){
            Logger.getLogger(DoanDAL.class.getName()).log(Level.SEVERE, null, ex);  
        }   
        connect.MySQLDisconnect();
    }

    public static void editDoan(DoanDTO t,String data) {
        MySQLConnect connect = new MySQLConnect();
        String query = "update doan set matour=?, tendoan=?, ngaydi=?, ngayve=?, chitietchuongtrinh=? where madoan=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, t.getMatour());
            ps.setString(2, t.getTendoan());
            ps.setString(3, t.getNgaydi());
            ps.setString(4, t.getNgayve());
            ps.setString(5, t.getChitietchuongtrinh());
            ps.setString(6, data);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }  
        connect.MySQLDisconnect();
    }

    public static void removeDoan(String madoan) {  
        MySQLConnect connect = new MySQLConnect();
        try{     
            String sql= "delete from doan where madoan='"+madoan+"'";
            connect.st = connect.conn.createStatement();
            connect.st.executeUpdate(sql);
        }catch(SQLException ex){
          Logger.getLogger(DoanDAL.class.getName()).log(Level.SEVERE, null, ex);
        }   
        connect.MySQLDisconnect();
    }   
    
    public static ArrayList<DoanDTO> loadDataDoanfromTour(String matour) {
        ArrayList<DoanDTO> dList = new ArrayList<>();
        MySQLConnect connect = new MySQLConnect();
        try {
            String query = "SELECT d.madoan, d.matour, d.tendoan, d.ngaydi, d.ngayve, d.chitietchuongtrinh FROM doan d, tours t where d.matour=t.matour and t.matour= '"+matour+"'";
            ps = new MySQLConnect().conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                DoanDTO d = new DoanDTO(rs.getString("madoan"),
                        rs.getString("matour"), rs.getString("tendoan"), rs.getString("ngaydi"),
                        rs.getString("ngayve"), rs.getString("chitietchuongtrinh"));
                dList.add(d);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DoanDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.MySQLDisconnect();
        return dList;
    }
}
