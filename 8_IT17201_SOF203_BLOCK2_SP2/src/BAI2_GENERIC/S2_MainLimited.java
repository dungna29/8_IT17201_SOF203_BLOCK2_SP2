/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2_GENERIC;

/**
 *
 * @author dungna29
 */
public class S2_MainLimited {

    public static void main(String[] args) {
        //S2_Limited<String> s2 = new S2_Limited<>(); Lỗi
        S2_Limited<Double> s2 = new S2_Limited<>();//number bên clas sẽ là kiểu Double
        s2.setNumber(8.7);
        System.out.println(s2.getThapPhan());
        System.out.println(s2.getNumber());

        S2_Limited<Float> s2Float = new S2_Limited<>(8.7f);
        System.out.println(s2Float.getThapPhan());
        
        //Sử dụng so sánh
        S2_Limited<Integer> s2Integer = new S2_Limited<>(10);
        S2_Limited<Float> s2Float2 = new S2_Limited<>(10.1f);
        System.out.println("s2Integer = s2Float2 ? ==" + s2Integer.checkEqual(s2Float2));
    }
}
