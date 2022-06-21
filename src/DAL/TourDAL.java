package DAL;

import DTO.TourDTO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TourDAL {

    public ArrayList<TourDTO> loadDataTour() {
        MySQLConnect connect = new MySQLConnect();
        Statement statement;
        ArrayList<TourDTO> DSTour = new ArrayList<>();
        try {
            String sql = "select * from tours";
            statement = connect.conn.createStatement();

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {
                TourDTO dd = new TourDTO(rs.getString("matour"),
                        rs.getString("tentour"), rs.getString("diemdulich"),
                        rs.getString("xuatphat"), rs.getString("mota"));
                DSTour.add(dd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.MySQLDisconnect();
        return DSTour;
    }

    public static void addTour(TourDTO t) {
        MySQLConnect connect = new MySQLConnect();
        try {
//            String sql = "INSERT INTO `tours`(`matour`, `tentour`, `diemdulich`, `xuatphat`, `mota`) "
//                    + "VALUES ('" + t.getMatour() + "','" + t.getTentour() + "','" + t.getDiemdulich() + "','" + t.getXuatphat() + "','" + t.getMota() + ")'";
            String sql = "insert into tours value('";
            sql += t.getMatour()+ "','" + t.getTentour() + "','" + t.getDiemdulich() + "','" + t.getXuatphat() + "','" + t.getMota() + "')";
            connect.st = connect.conn.createStatement();
            connect.st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.MySQLDisconnect();
    }

    public static void editTour(TourDTO t, String data) {
        PreparedStatement ps;
        MySQLConnect connect = new MySQLConnect();
        String query = "update tours set tentour=?, diemdulich=?, xuatphat=?, mota=? where matour=?";
        try {
            ps = new MySQLConnect().conn.prepareStatement(query);
            ps.setString(1, t.getTentour());
            ps.setString(2, t.getDiemdulich());
            ps.setString(3, t.getXuatphat());
            ps.setString(4, t.getMota());
            ps.setString(5, data);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        connect.MySQLDisconnect();
    }

    public static void removeTour(String matour) {
        MySQLConnect connect = new MySQLConnect();
        try {
            String sql = "delete from tours where matour='" + matour + "'";
            connect.st = connect.conn.createStatement();
            connect.st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(TourDAL.class.getName()).log(Level.SEVERE, null, ex);
        }
        connect.MySQLDisconnect();
    }

}
