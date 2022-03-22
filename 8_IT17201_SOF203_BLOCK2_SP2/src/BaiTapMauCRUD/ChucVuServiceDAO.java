/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMauCRUD;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dungna29
 */
public class ChucVuServiceDAO {

    final String INSERT_SQL = "INSERT INTO [dbo].[ChucVu] ([MaChucVu],[TenChucVu])VALUES(?,?)";
    final String UPDATE_SQL = "UPDATE [dbo].[ChucVu] SET [MaChucVu] = ? WHERE [IdChucVu] = ?";
    final String DELETE_SQL = "DELETE FROM [dbo].[ChucVu] WHERE [IdChucVu] = ?";
    final String SELECT_BY_SQL = "SELECT * FROM [dbo].[ChucVu] WHERE [IdChucVu] = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM [dbo].[ChucVu]";
    List<ChucVu> _lstChucVus;

    public ChucVuServiceDAO() {
        _lstChucVus = new ArrayList<>();
    }

    public String insert(ChucVu obj) {
        DBConnection.ExcuteDungna(INSERT_SQL, obj.getMaChucVu(), obj.getTenChucVu());
        return "Insert thành công";
    }

    public String update(ChucVu obj) {
        DBConnection.ExcuteDungna(UPDATE_SQL, obj.getMaChucVu(), obj.getTenChucVu());
        return "Insert thành công";
    }

    public String delete(ChucVu obj) {
        DBConnection.ExcuteDungna(DELETE_SQL, obj.getIdChucVu());
        return "Insert thành công";
    }

    public List<ChucVu> selectAll() {
        return getSelectSql(SELECT_ALL_SQL);

    }

    public List<ChucVu> getSelectSql(String sql, Object... args) {
        try {
            ResultSet rs = DBConnection.getDataFromQuery(sql, args);
            while (rs.next()) {
                _lstChucVus.add(new ChucVu(rs.getInt(1), rs.getNString(2), rs.getNString(3)));
            }
            return _lstChucVus;
        } catch (SQLException ex) {
            throw new RuntimeException();
        }

    }

}
