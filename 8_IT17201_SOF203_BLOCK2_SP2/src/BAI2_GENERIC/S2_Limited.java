package BAI2_GENERIC;

import javax.naming.LimitExceededException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dungna29
 */
//Giới hạn kiểu dữ liệu không cho phép đặt thoải mái mà chỉ được là kiểu số
public class S2_Limited<T extends Number> {
    private T number;

    public S2_Limited() {
    }

    public S2_Limited(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }
    
    public double getThapPhan(){// 5.6 - 5
        return number.doubleValue() - number.intValue();
    }
    // Dấu ? đại diện cho tất cả các kiểu dữ liệu thuộc Number
    public boolean checkEqual(S2_Limited<?> limited){
        if (number.doubleValue() == limited.getNumber().doubleValue()) {
            return true;
        }
        return false;
    }
}
