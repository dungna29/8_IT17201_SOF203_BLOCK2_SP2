/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4_JDBC;
import static BAI4_JDBC.S2_DbConnection.acc;
import static BAI4_JDBC.S2_DbConnection.pass;
import java.sql.*;//Phải thuộc 
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dungna29
 */
public class S5_CRUD {
    public static void main(String[] args) {
        try {
            //Bước 2: Tạo kết nối - Open Conenction
            Connection conn = new S5_CRUD().getConnectionDB();

            //Bước 3: Tạo Statement sau đó mới thực thi câu lệnh sql
            Statement st = conn.createStatement();

            //Bước 4: Thực thi câu lệnh sql
            
            //Bài 1: INSERT, DELETE, UPDATE đều sử dụng cơ chế Excuteupdate
            String insert = "INSERT INTO [ChucVu] ([MaChucVu],[TenChucVu])"
                    + "Values('Dungna2999','Dungaaa')";
            
            st.executeUpdate(insert);
            st.close();
            //Bước 5: Đóng kết nối vào CSDL
            conn.close();
            System.out.println("Kết nối thành công vào sql");
        } catch (Exception ex) {
            System.out.println("Kế nối thất bại");

        }
    }
    Connection getConnectionDB(){
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=DungNA_ShopFPT";
            String acc = "sa",pass ="abc@123A";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
            return DriverManager.getConnection(url,acc,pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Kế nối thất bại");
        return null;
    }
}
