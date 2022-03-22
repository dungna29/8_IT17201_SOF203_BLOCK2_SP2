/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTapMauCRUD;

/**
 *
 * @author dungna29
 */
public class Main {
    public static void main(String[] args) {
        ChucVuServiceDAO cvs = new ChucVuServiceDAO();
        ChucVu cv1 = new ChucVu(1, "Dung2022", "Dung2022");
        cvs.insert(cv1);
        for (ChucVu x : cvs.selectAll()) {
            System.out.println(x.toString());
        }
    }
}
