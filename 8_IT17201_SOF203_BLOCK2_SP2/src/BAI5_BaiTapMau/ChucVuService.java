/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5_BaiTapMau;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Comparator;
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
    public String updateChucVu(ChucVu cv){
        try {
            if (getIndexByMa(cv.getMa()) == -3) return "Không tìm thấy mã";
            return updateChucVuToDB(cv);
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuService.class.getName()).log(Level.SEVERE, null, ex);
            return "Không thành công";
        }
    }
    public String deleteChucVu(ChucVu cv){
        try {
            if (getIndexByMa(cv.getMa()) == -3) return "Không tìm thấy mã";
            return deleteChucVuToDB(cv);
        } catch (SQLException ex) {
            Logger.getLogger(ChucVuService.class.getName()).log(Level.SEVERE, null, ex);
            return "Không thành công";
        }
    }
    public List<ChucVu> sort(int temp){//Nếu là 1 = ASC, 0 = DESC
        if (temp ==1) {
            _lstChucVus.sort(Comparator.comparing(ChucVu::getMa));
            return _lstChucVus;
        }
        _lstChucVus.sort(Comparator.comparing(ChucVu::getMa).reversed());
        return _lstChucVus;
    }
     public List<ChucVu> search(String temp){//Tìm kiếm theo 2 cột
        List<ChucVu> lstTemp = new ArrayList<>();
         for (ChucVu x : _lstChucVus) {
             if (x.getMa().toLowerCase().contains(temp.toLowerCase()) || x.getTen().toLowerCase().contains(temp.toLowerCase())) {
                 lstTemp.add(x);
             }
         }
         return lstTemp;
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
        if (getIndexByMa(cv.getMa()) !=-3) return "Mã đã tồn tại";
        _st = _dBConnection.openDbConnection().createStatement();
        //Vì cơ sở dữ liệu thầy đang để tự tăng nên không cần truyền ID
       String insert = "INSERT INTO [ChucVu] ([Ma],[Ten])"
                    + "Values(N'"+ cv.getMa()+"',N'"+cv.getTen()+"')";
       _st.executeUpdate(insert);
       return "Thêm vào DB thành công";
    }
    
     public String updateChucVuToDB(ChucVu cv) throws SQLException{
        _st = _dBConnection.openDbConnection().createStatement();
       String update = "UPDATE [ChucVu] SET [Ten] = '"+cv.getTen()+"' WHERE [Ma]='"+cv.getMa()+"'";
       _st.executeUpdate(update);
       return "Sửa vào DB thành công";
    }
     public String deleteChucVuToDB(ChucVu cv) throws SQLException{
        _st = _dBConnection.openDbConnection().createStatement();
       String delete = "DELETE FROM [ChucVu] WHERE [Ma]='"+cv.getMa()+"'";
       _st.executeUpdate(delete);
       return "Xoá vào DB thành công";
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
