/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_SenderEmail;

/**
 *
 * @author dungna29
 */
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
/*
Để thực hiện được phải làm các bước sau:
1. Cài sẵn JAR: activation-1.1.1.jar, javax.mail.jar
2. Tắt bảo mật 2 lớp, tốt nhất tạo mail mới.
3. Mở kết nối không an toàn trên mail đến tháng 5 không còn dùng được tính năng này nữa: https://myaccount.google.com/lesssecureapps?pli=1&rapt=AEjHL4NUvRM11vWxYg3DQjThUAiuMR4HOA6tMWdT2wCioVPchH_ImampRkvr0Cacyc8lAv_l_nzT8O5CECOiAQHlFod6I9kNtw

*/
public class SendMailSSL_Secure_Sockets_Layer {
    public static void main(String[] args) {
        
        // Cấu hình tài khoản cho đối tượng
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", MailConfig.HOST_NAME);
        props.put("mail.smtp.socketFactory.port", MailConfig.SSL_PORT);
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.port", MailConfig.SSL_PORT);
 
        // Lấy Phiên làm việc khi đăng nhập vào thành công.
        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MailConfig.APP_EMAIL, MailConfig.APP_PASSWORD);
            }
        });
 
        // Nội Dung mail
        try {
            MimeMessage message = new MimeMessage(session);
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(MailConfig.RECEIVE_EMAIL));
            message.setSubject("Tiêu đề mail gửi cho Dungna29 nè");
            message.setText("Chào các bạn đến với Gửi Mail");
 
            // send message
            Transport.send(message);
 
            System.out.println("Gửi mail thành công");
        } catch (MessagingException e) {
           e.printStackTrace();
        }

    }
}
