package BAI2_GENERIC;


import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dungna29
 */
public class S1_Generic {
    /*
    Generics là một tính năng của Java giúp cho lập trình viên có thể chỉ định rõ kiểu dữ liệu 
    mà họ muốn làm việc với một class, một interface hay một phương thức nào đó.
    Đặt tên kiểu tham số là rất quan trọng để học Genericics. Nó không bắt buộc, 
    tuy nhiên chúng ta nên đặt theo quy ước chung để dễ đọc, dễ bảo trì. 
    Các kiểu tham số thông thường như sau:
   
    Một số quy ước đặt tên kiểu tham số Generic
    E- Element (phần tử – được sử dụng phổ biến trong Collection Framework)
    K – Key (khóa)
    V – Value (giá trị)
    N – Number (kiểu số: Integer, Double, Float, …)
    T – Type (Kiểu dữ liệu bất kỳ thuộc Wrapper class: String, Integer, Long, Float, …)
    S, U, V … – được sử dụng để đại diện cho các kiểu dữ liệu (Type) thứ 2, 3, 4, …
    */
    public static void main(String[] args) {
        //Ứng dụng của Generic đã được gặp ở JAVA1
        List<String> temp1 = new ArrayList<>();
        List<Double> temp2= new ArrayList<>();
        List<Integer> temp3 = new ArrayList<>();
        
    }
}
