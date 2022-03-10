/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1_ENUM;

/**
 *
 * @author dungna29
 */
/*
    Khai báo Enum nằm bên ngoài 1 Class nhưng không được khai báo Access modifier
 */
enum NgayTrongTuan {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class S1_Enum {
//    enum NgayTrongTuan{
//        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY;
//    }

    public static void main(String[] args) {
        /*
            1. Là từ khoá kiểu dữ liệu đặc biệt trong java
            2. Được đại diện cho các hằng
            3. Bởi vì các giá trị là hằng nên các trường đều là các chữ cái viết hoa
            4. Enum có thể implement interface
         */
        for (NgayTrongTuan x : NgayTrongTuan.values()) {
            System.out.println(x);
        }
        System.out.println("-------------");
        // Lấy 1 giá trị trong Enum thì cần gọi đến enum và chấm giá trị
        var ngayTrongTuan = NgayTrongTuan.THURSDAY;
        System.out.println(ngayTrongTuan);

        //So sánh enum
        var today = NgayTrongTuan.THURSDAY;
        if (today.equals(NgayTrongTuan.SUNDAY)) {
            System.out.println("Hôm này là ngày được nghỉ");
        } else {
            System.out.println("Hôm nay là ngày phải đi học");
        }
        //Đối với enum có thể sử dụng toán tử == để so sánh
        if (today == NgayTrongTuan.SUNDAY) {
            System.out.println("Hôm này là ngày được nghỉ");
        } else {
            System.out.println("Hôm nay là ngày phải đi học");
        }
    }
}
