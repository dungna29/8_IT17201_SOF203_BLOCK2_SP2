/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_JDBC;

import java.sql.*;//Phải thuộc 

/**
 *
 * @author dungna29
 */
public class S2_DbConnection {

    static String hostName = "localhost";
    static String acc = "sa";
    static String pass = "abc@123A";
    static String dbName = "DungNA_ShopFPT";
    static String connectionSql
            = "jdbc:sqlserver://" + hostName + ":1433;databaseName=" + dbName;//Lấy đường dẫn nhanh vào phần Service

    public static void main(String[] args) {
        try {
            //Bước 1: Load Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");//Trước khi copy vào thì nên gõ com. bên ngoài đầy đủ rồi tiến hành gõ vào forName

            //Bước 2: Tạo kết nối - Open Conenction
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=DungNA_ShopFPT", acc, pass);

            //Bước 3: Tạo Statement sau đó mới thực thi câu lệnh sql
            Statement st = conn.createStatement();

            //Bước 4: Thực thi câu lệnh sql
            String query = "SELECT * FROM CHUCVU";//1 Câu lệnh sql
            ResultSet rs = st.executeQuery(query);//Thực thi câu truy vấn và đổ dữ liệu về ResultSet

            st.close();
            //Bước 5: Đóng kết nối vào CSDL
            conn.close();
            System.out.println("Kết nối thành công vào sql");
        } catch (Exception ex) {
            System.out.println("Kế nối thất bại");

        }
    }
}
