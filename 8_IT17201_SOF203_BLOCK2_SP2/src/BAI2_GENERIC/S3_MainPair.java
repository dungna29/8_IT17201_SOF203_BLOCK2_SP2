/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2_GENERIC;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class S3_MainPair {
    public static void main(String[] args) {
        //
        S3_Pair<String,String> pair = new S3_Pair<>("Dog", "Chó");
        System.out.printf("%s = %s",pair.getKey(),pair.getValues());
        List<S3_Pair<S3_Pair<String,String>,S3_Pair<String,String>>> lst = new ArrayList<>();
       
    }
}
