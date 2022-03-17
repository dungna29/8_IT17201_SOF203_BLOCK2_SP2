/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_JDBC;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dungna29
 */
public class S2_DBConnection {
      public static void main(String[] args) {  
        try {
            S2_DBConnection bConnection = new S2_DBConnection();
            Connection conn = bConnection.getConnectionDB();
            Statement st = null;//Sql
            ResultSet rs = null;//Tập hợp các bản ghi sau khi sử câu lệnh sql truy vấn
            String sqlQuery = "SELECT * FROM CHUCVU";
            st = conn.createStatement();
            rs = st.executeQuery(sqlQuery);
            while (rs.next()) {
                System.out.println(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(S2_DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Connection getConnectionDB() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DungNA_ShopFPT";
            String user = "sa";
            String pass = "abc@123A";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Ket noi thanh cong");
            return DriverManager.getConnection(url, user, pass);
        } catch (Exception ex) {
            Logger.getLogger(S2_DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Ket noi that bai");
        return null;
    }
}
