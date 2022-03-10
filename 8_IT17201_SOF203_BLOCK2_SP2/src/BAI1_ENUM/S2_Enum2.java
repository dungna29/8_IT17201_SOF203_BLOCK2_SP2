/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1_ENUM;

/**
 *
 * @author dungna29
 */
public class S2_Enum2 {
    enum CacLoaiPhuongTien{
        //Các phần tử dưới đây luôn là Static FINAL
        CAR(5),TRUCK(9),AIRPLANE(10),TRAIN(7);
        private int value;
        //Contrucstor nó chỉ được sử dụng trong nội bộ của enum
        //Access Modifier của contructor này luôn là private
        //Kể cả khi không khai báo mặc định cũng là private
        CacLoaiPhuongTien(int value){//Contrucstor của enum
            this.value = value;
        }
        //Phương thức dưới đây nằm trong enum
        public static CacLoaiPhuongTien getValuesByMe(int value){
            for (var x : CacLoaiPhuongTien.values()) {
                if (x.value == value) {
                    return x;
                }
            }
            return null;
        }
    }
    public static void main(String[] args) {
        for (CacLoaiPhuongTien x : CacLoaiPhuongTien.values()) {
            System.out.println(x + " " + x.value);
        }
        System.out.println("-------");
        //Sử dụng phương thức enum
        System.out.println(CacLoaiPhuongTien.getValuesByMe(99));
        System.out.println("------");
        //Phép gán trong enum
        CacLoaiPhuongTien temp;
        temp = CacLoaiPhuongTien.TRAIN;//Phép gán
        System.out.println(temp);
        
        PhuongTienTrenKhong temp2;
//        temp2 = CacLoaiPhuongTien.TRAIN; Phép gán lỗi
        
    }
    enum PhuongTienTrenKhong{
        
    }
}
