/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2_GENERIC.UngDung;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class Service<T> implements IServiceCRUD<T>{

    List<T> lstTemp = new ArrayList<>();

    public Service() {
    }
    
    @Override
    public String add(T st) {
       lstTemp.add(st);
       return "Thêm thành công";
    }

    @Override
    public String edit(T st) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(T st) {
        lstTemp.remove(st);
        return "Xoá thành công";
    }
    @Override
    public List<T> getlstStudents() {
     return lstTemp;
    }
    
}
