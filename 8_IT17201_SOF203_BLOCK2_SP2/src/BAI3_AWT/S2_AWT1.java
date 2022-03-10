/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3_AWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author dungna29
 */
public class S2_AWT1 extends Frame implements ActionListener{
    Button btnRed,btnYellow;//Khởi tạo 2 nút 
    Label lbltext = new Label();//Khởi tạo 1 nhãn

    public S2_AWT1(String title) throws HeadlessException {
        setTitle(title);//Set tên cho form
        setLayout(new FlowLayout());//Set bố cục của form
        btnRed = new Button("Nút đỏ");//Khởi tạo cái tên nút
        add(btnRed);//Add nút vào GUI
        btnRed.addActionListener(this);//Sự kiện cho nút mình vừa add
    }
    
    public static void main(String[] args) {
        S2_AWT1 frm = new S2_AWT1("FPOLY FORM");
        frm.setSize(500,300);
        frm.show();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String str = e.getActionCommand();
        if (str.equals("Nút đỏ")) {
            this.setBackground(Color.RED);
        }
    }
    
}
