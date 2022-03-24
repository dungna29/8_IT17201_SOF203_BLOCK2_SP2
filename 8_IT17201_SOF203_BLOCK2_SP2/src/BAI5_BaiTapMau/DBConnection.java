/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5_BaiTapMau;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author dungna29
 */
public class DBConnection {
    private static String hostName = "localhost";
    private static String acc = "sa";
    private static String pass = "abc@123A";
    private static String dbName = "FINAL_ASSIGNMENT_JAVA3_DUNGNA29_V2";
    private static String connectionSql
            = "jdbc:sqlserver://" + hostName + ":1433;databaseName=" + dbName;
    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static Connection conn;

    static {
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            System.out.println("Lỗi Driver");
        }
    }

    //1. Mở kết nối
    static Connection openDbConnection() {
        try {
            return DriverManager.getConnection(connectionSql, acc, pass);
        } catch (SQLException ex) {
            return null;
        }
    }
}
