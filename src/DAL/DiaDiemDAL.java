/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.DiaDiemDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DiaDiemDAL {

    public ArrayList<DiaDiemDTO> loadDataDiaDiem() {
        ArrayList<DiaDiemDTO> DSDiaDiem = new ArrayList<>();
        MySQLConnect connect = new MySQLConnect();
        
        Statement statement = null;
        
        try {                                           
            String sql = "select * from diadiem";
            statement = connect.conn.createStatement();
            
            ResultSet rs = statement.executeQuery(sql);
            
            while (rs.next()) {                
                DiaDiemDTO dd = new DiaDiemDTO(rs.getString("madd"), 
                        rs.getString("thanhpho"), rs.getString("tendd"), rs.getString("mota"));                
                DSDiaDiem.add(dd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DiaDiemDAL.class.getName()).log(Level.SEVERE, null, ex);
        } 
            
        connect.MySQLDisconnect();                        
        return DSDiaDiem;
    }


    public static void addDiaDiem(DiaDiemDTO dd) {
        MySQLConnect connect = new MySQLConnect();
        try{
           String sql = "insert into diadiem value('";
           sql += dd.getMadd()+"','"+dd.getThanhpho()+"','"+dd.getTendd()+"','"+dd.getMota()+"')";
           connect.st = connect.conn.createStatement();
           connect.st.executeUpdate(sql);        
        }catch(SQLException ex){
            Logger.getLogger(DiaDiemDAL.class.getName()).log(Level.SEVERE, null, ex);  
        }   
        connect.MySQLDisconnect();    
    }



    public static void editDiaDiem(DiaDiemDTO pt,String data) {
        PreparedStatement ps = null;
        String query = "update diadiem set thanhpho=?, tendd=? , mota=? where madd=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, pt.getThanhpho());
            ps.setString(2, pt.getTendd());
            ps.setString(3, pt.getMota());          
            ps.setString(4, data);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }      
    }


    public static void removeDiaDiem(String madd) {
        MySQLConnect connect = new MySQLConnect();
        try{
          String sql= "delete from diadiem where madd='"+madd+"'";

          connect.st = connect.conn.createStatement();
          connect.st.executeUpdate(sql);

        }catch(SQLException ex){
          Logger.getLogger(DiaDiemDAL.class.getName()).log(Level.SEVERE, null, ex);
        }    
    }    
    
}
