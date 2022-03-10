/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BAI2_GENERIC.UngDung;

import java.util.List;

/**
 *
 * @author dungna29
 */
public interface IServiceCRUD<T> {

    public String add(T st);

    public String edit(T st);

    public String delete(T st);

    

    public List<T> getlstStudents();
}
