package Class;

//import GUI.Forgetpassword;
import database.data;
import java.awt.Color;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.PasswordField;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Theekshana
 */
public class EmailSender {

    String from;
    String to;
    String pw;
    String sub;
    String mes;
    int count;

    public void sendMail1(String from, String to, String pw, String sub, String mess, JFrame j,JTextField sendertext,String savecode) {
        System.out.println("maneesha");
        this.from = from;
        this.to = to;
        this.pw = pw;
        this.sub = sub;
        this.mes = mess;

        try {
            // Get system props
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            // Get the default Session object.
            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {

                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, pw);
                }
            });

            // Define message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO,
                    new InternetAddress(to));
            message.setSubject(sub);

            // Create the message part
            BodyPart messageBodyPart = new MimeBodyPart();

            // Fill the message
            messageBodyPart.setText(mes);

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            // Put parts in message
            message.setContent(multipart);

            // Send  message
            Transport.send(message);
            data.iud("UPDATE user SET code='"+savecode+"' WHERE email='"+to+"' ");
           
        } catch (Exception e) {
            e.printStackTrace();
            sendertext.setText("TRY WITH ADMIN");
           sendertext.setEditable(false);

        }
    }

}

