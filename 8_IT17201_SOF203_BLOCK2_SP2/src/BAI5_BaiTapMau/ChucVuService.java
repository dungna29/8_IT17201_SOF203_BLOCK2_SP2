/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5_BaiTapMau;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author dungna29
 */
//Giải quyết các chức năng của đối tượng
public class ChucVuService {
    /*
       Phần 1: 
        - Khai báo toàn bộ các biến toàn cục và có dấu _.
    */
    List<ChucVu> _lstChucVus;
    DBConnection _dBConnection;
    ResultSet _rs = null;
    Statement _st = null;
    ChucVu _chucVu;
    public ChucVuService() {
        try {
            _lstChucVus = new ArrayList<>();
            _dBConnection = new DBConnection();
            getlstChucVusFromDB();
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*
        Phần 2: 
        - Các chức năng thêm sửa xoá....
    */
    public List<ChucVu> getlstChucVus(){
        return _lstChucVus;
    }
    public String addChucVu(ChucVu cv){
        try {
            if (cv == null) return "Không thành công";
            return insertChucVuToDB(cv);
        } catch (SQLException ex) {
          return "Không thành công";
        }
    }
    /*
       Phần 3:
        - Các phương thức liên quan đến DB
    */
    public void getlstChucVusFromDB() throws SQLException{
        _lstChucVus = new ArrayList<>();
        String select = "SELECT * FROM CHUCVU";
        _st = _dBConnection.openDbConnection().createStatement();
        _rs = _st.executeQuery(select);//Thực thi truy vấn
        while (_rs.next()) {
            _lstChucVus.add(new ChucVu(_rs.getInt(1), _rs.getNString(2), _rs.getNString(3)));//Đổ từng dòng dữ liệu vào trong List
        }
        _st.close();
    }
    public String insertChucVuToDB(ChucVu cv) throws SQLException{
        _st = _dBConnection.openDbConnection().createStatement();
        //Vì cơ sở dữ liệu thầy đang để tự tăng nên không cần truyền ID
       String insert = "INSERT INTO [ChucVu] ([Ma],[Ten])"
                    + "Values('"+ cv.getMa()+"','"+cv.getTen()+"')";
       _st.executeUpdate(insert);
       return "Thêm vào DB thành công";
    }
    //Viết 1 thằng check trùng
    public int getIndexByMa(String maChuVu){
        for (int i = 0; i < _lstChucVus.size(); i++) {
            if (_lstChucVus.get(i).getMa().equalsIgnoreCase(maChuVu)) {
                return i;
            }
        }
        return -3;
    }
}
