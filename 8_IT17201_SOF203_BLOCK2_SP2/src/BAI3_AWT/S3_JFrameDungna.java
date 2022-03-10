/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3_AWT;

import java.awt.HeadlessException;
import javax.swing.*;

/**
 *
 * @author dungna29
 */
public class S3_JFrameDungna extends JFrame{

    public S3_JFrameDungna() {
        setTitle("S3_JFrameDungna");
        setSize(700,500);
        setLocationRelativeTo(null);//Cho ứng khi chạy sẽ hiển thị ở giữa màn hình
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Bấm được nút x khi mở form lên
        
        setResizable(false);//Không cho phép kéo giãn kích thước
        setVisible(true);//Hiển thị form lên
    }
    
}
