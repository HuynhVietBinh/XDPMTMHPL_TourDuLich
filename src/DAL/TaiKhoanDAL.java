/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.TaiKhoanDTO;
import java.security.MessageDigest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Vo Duy Kiet
 */
public class TaiKhoanDAL {

    private PreparedStatement ps;
    private ResultSet rs;
    private MySQLConnect connect = new MySQLConnect();

//    public String getMD5(String md5){
//        try {
//            MessageDigest md=MessageDigest.getInstance("MD5");
//            byte[] array=md.digest(md5.getBytes());
//            
//            StringBuffer sb=new StringBuffer();
//            for(int i=0;i<array.length;++i)
//            {
//                  sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
//            }
//            return sb.toString();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//    public boolean Login(TaiKhoanDTO tk) {
//        String query = "SELECT * FROM taikhoan";
//        try {
//            ps = connect.conn.prepareStatement(query);
//            rs=ps.executeQuery();
//            while(rs.next()){
//                if(rs.getString("username").equals(tk.getUsername()) && rs.getString("password").equals(tk.getPassword())){
//                    break;
//                }
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    public boolean Register(TaiKhoanDTO tk) {
        String query = "INSERT INTO taikhoan(username,password) VALUE(?,?)";
        try {
            ps = connect.conn.prepareStatement(query);
            ps.setString(1, tk.getUsername());
            ps.setString(2, tk.getPassword());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
