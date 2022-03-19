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
public class S2_DbConnection_TrienKhaiPhuongThuc {
    public static void main(String[] args) {
        try {
            //Bước 2: Tạo kết nối - Open Conenction
            Connection conn = new S2_DbConnection_TrienKhaiPhuongThuc().getConnectionDB();

            //Bước 3: Tạo Statement sau đó mới thực thi câu lệnh sql
            Statement st = conn.createStatement();

            //Bước 4: Thực thi câu lệnh sql
            String query = "SELECT * FROM CHUCVU";//1 Câu lệnh sql
            ResultSet rs = st.executeQuery(query);//Thực thi câu truy vấn và đổ dữ liệu về ResultSet
            while (rs.next()) {
                System.out.println(rs.getString(2));//Index cột không bắt đầu từ 0 
            }
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
            //System.out.println("Kế nối CSDL thành công");
            return DriverManager.getConnection(url,acc,pass);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Kế nối thất bại");
        return null;
    }
}
