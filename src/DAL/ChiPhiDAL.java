/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiPhiDTO;
import DTO.TourDTO;
import java.sql.DriverManager;
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
public class ChiPhiDAL {
    
    private static PreparedStatement ps = null;
    private static ResultSet rs = null;

    public ArrayList<ChiPhiDTO> loadDataChiPhi() {
        
        ArrayList<ChiPhiDTO> cpList = new ArrayList<>();
        
        try {
            String query = "SELECT * FROM chiphi";
            ps = new MySQLConnect().conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                ChiPhiDTO cp = new ChiPhiDTO(rs.getString("macp"), rs.getString("madoan"),
                        rs.getInt("tongchiphi"), rs.getString("chitiet"));
                cpList.add(cp);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChiPhiDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cpList;
    }
    

    public static void addChiPhi(ChiPhiDTO cp) {
        String query = "INSERT INTO `chiphi`(`macp`, `madoan`, `tongchiphi`, `chitiet`) VALUES (?,?,?,?)";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, cp.getMaCP());
            ps.setString(2, cp.getMaDoan());
            ps.setInt(3, cp.getTongCP());
            ps.setString(4, cp.getChiTiet());
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void editChiPhi(ChiPhiDTO cp) {
        String query = "UPDATE chiphi SET madoan=?, tongchiphi=?, chitiet=? WHERE macp=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(4, cp.getMaCP());
            ps.setString(1, cp.getMaDoan());
            ps.setInt(2, cp.getTongCP());
            ps.setString(3, cp.getChiTiet());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void removeChiPhi(String macp) {
        String query = "DELETE FROM chiphi WHERE macp=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, macp);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
