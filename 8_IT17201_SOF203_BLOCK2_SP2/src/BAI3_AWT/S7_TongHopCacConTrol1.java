/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package BAI3_AWT;

import java.util.Hashtable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author dungna29
 */
public class S7_TongHopCacConTrol1 extends javax.swing.JFrame {

    /**
     * Creates new form S7_TongHopCacConTrol1
     */
    public S7_TongHopCacConTrol1() {
        initComponents();
        setLocationRelativeTo(null);
        volumne();
        Month();
    }
    void Month(){
        Hashtable hashtable = new Hashtable();
        String[] arrThang = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        for (int i = 0; i < 12; i++) {
            hashtable.put(i, new JLabel(arrThang[i]));  
        }
         jSlider_Month.setLabelTable(hashtable);
    }
    void volumne(){
        jSlider_Volume.setPaintTicks(true);//Cho phé sử dử dụng Major
        jSlider_Volume.setMajorTickSpacing(10);//Từ vị trí 0 đến giữa sẽ là 50
        
        //Thêm nhãn 
        jSlider_Volume.setPaintLabels(true);
        Hashtable hashtable = jSlider_Volume.createStandardLabels(25);
        jSlider_Volume.setLabelTable(hashtable);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_mess = new javax.swing.JButton();
        btn_Confirm = new javax.swing.JButton();
        btn_Option1 = new javax.swing.JButton();
        btn_Input = new javax.swing.JButton();
        btn_Option2 = new javax.swing.JButton();
        txt_input = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_img = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSlider_Volume = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        lbl_Vl = new javax.swing.JLabel();
        jSlider_Month = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dialog"));

        btn_mess.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btn_mess.setText("Message");
        btn_mess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_messActionPerformed(evt);
            }
        });

        btn_Confirm.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btn_Confirm.setText("Confirm");
        btn_Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ConfirmActionPerformed(evt);
            }
        });

        btn_Option1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btn_Option1.setText("Option 1");
        btn_Option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Option1ActionPerformed(evt);
            }
        });

        btn_Input.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btn_Input.setText("Input");
        btn_Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InputActionPerformed(evt);
            }
        });

        btn_Option2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btn_Option2.setText("Option 2");
        btn_Option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Option2ActionPerformed(evt);
            }
        });

        txt_input.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_mess)
                    .addComponent(btn_Confirm)
                    .addComponent(btn_Option1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Input)
                    .addComponent(btn_Option2)
                    .addComponent(txt_input, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_mess)
                    .addComponent(btn_Input))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Confirm)
                    .addComponent(btn_Option2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Option1)
                    .addComponent(txt_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Img Button"));

        btn_img.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        btn_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BAI3_AWT/social-facebook-box-blue-icon.png"))); // NOI18N
        btn_img.setText("FPOLY");
        btn_img.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imgActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(btn_img, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(57, 57, 57)
                    .addComponent(btn_img)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Slider"));

        jSlider_Volume.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider_VolumeStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("Volume");

        lbl_Vl.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lbl_Vl.setText("Volume");

        jSlider_Month.setMaximum(12);
        jSlider_Month.setPaintLabels(true);
        jSlider_Month.setPaintTicks(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Vl)
                .addGap(91, 91, 91))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSlider_Month, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSlider_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jSlider_Volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbl_Vl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSlider_Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(347, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_messActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_messActionPerformed
        JOptionPane.showMessageDialog(this, "Chào các bạn học JAVA3");
    }//GEN-LAST:event_btn_messActionPerformed

    private void btn_InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InputActionPerformed
      String temp =  JOptionPane.showInputDialog(this, "Bạn có muốn học lại java3 không?");
      txt_input.setText(temp);
    }//GEN-LAST:event_btn_InputActionPerformed

    private void btn_ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ConfirmActionPerformed
     int temp =  JOptionPane.showConfirmDialog(this, "Bạn có muốn học lại java 3 không?");
        if (temp == 1) {
            JOptionPane.showMessageDialog(this, "Bạn sẽ được toại nguyện 1");
        }else if(temp == 0){
            JOptionPane.showMessageDialog(this, "Bạn sẽ được toại nguyện 0");
        }else{
            JOptionPane.showMessageDialog(this, "Bạn sẽ được toại nguyện 2");
        }
    }//GEN-LAST:event_btn_ConfirmActionPerformed

    private void btn_Option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Option1ActionPerformed
        Object[] objects = {"Có","Chưa"};
        int choice = JOptionPane.showOptionDialog(this, "Bạn có người yêu chưa?", "Câu hỏi khó", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, objects, objects[0]);
        if (choice == 0) {
            JOptionPane.showMessageDialog(this, "Bạn đã chọn có");
            return;
        }
        JOptionPane.showMessageDialog(this, "Bạn đã chọn chưa");
    }//GEN-LAST:event_btn_Option1ActionPerformed

    private void btn_Option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Option2ActionPerformed
       Object[] objects = {"C#","JAVA3","JAVA4","C#4"};
       int choice = JOptionPane.showOptionDialog(this, "Bạn thích ngôn ngữ nào?", "Câu hỏi chuyên ngành", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, objects, objects[0]);
        switch (choice) {
            case 0:
                JOptionPane.showMessageDialog(this, "Bạn đã chọn " + objects[0]);
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Bạn đã chọn " + objects[1]);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Bạn đã chọn " + objects[2]);
                break;
            case 3:
                JOptionPane.showMessageDialog(this, "Bạn đã chọn " + objects[3]);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_Option2ActionPerformed

    private void btn_imgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_imgActionPerformed

    private void jSlider_VolumeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider_VolumeStateChanged
        if (jSlider_Volume.getValueIsAdjusting()) {
            //return;//Trong khi chưa dừng kéo thì sẽ không chạy xuống dưới
        }
        lbl_Vl.setText(String.valueOf(jSlider_Volume.getValue()));
    }//GEN-LAST:event_jSlider_VolumeStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(S7_TongHopCacConTrol1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S7_TongHopCacConTrol1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S7_TongHopCacConTrol1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S7_TongHopCacConTrol1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S7_TongHopCacConTrol1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Confirm;
    private javax.swing.JButton btn_Input;
    private javax.swing.JButton btn_Option1;
    private javax.swing.JButton btn_Option2;
    private javax.swing.JButton btn_img;
    private javax.swing.JButton btn_mess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSlider jSlider_Month;
    private javax.swing.JSlider jSlider_Volume;
    private javax.swing.JLabel lbl_Vl;
    private javax.swing.JTextField txt_input;
    // End of variables declaration//GEN-END:variables
}