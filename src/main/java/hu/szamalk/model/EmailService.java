/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hu.szamalk.model;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 *
 * @author Roland
 */
public class EmailService {
     private String email;
    private String password;

    private final Properties prop;
    
    public EmailService(String host, String port, String email, String password) {
                prop = new Properties();
                prop.put("mail.smtp.auth", "true");
                prop.put("mail.smtp.starttls.enable", "true");
                prop.put("mail.smtp.host", host);
                prop.put("mail.smtp.port", port);
                prop.put("mail.smtp.ssl.trust", host);
                prop.put("mail.smtp.socketFactory.port", "465");
                prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
                prop.put("mail.smtp.socketFactory.fallback", "false");
                
                this.email = email;
                this.password = password;
    }   
    
    public void sendMail(
            String to,
            String subject,
            String msg
    ) throws Exception {
        this.sendMail(to, subject, msg, "", new String[0]);
    }

    public void sendMail(
            String to,
            String subject, 
            String msg, 
            String filepath, 
            String[] attachments
    ) throws Exception {
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, password);
            }
        });
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(email));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
        message.setSubject(subject);
        message.setContent(addContents(msg, filepath, attachments));
        try {
            Transport.send(message);
        } catch (Exception e) {
            System.out.println("Hibba!");
            System.out.println(e.getMessage());
        }
    }
    
    private Multipart addContents(String msg, String filepath, String[] filenames) throws MessagingException{
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(msg, "text/html; charset=utf-8");
        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);
        if(filenames != null){
            for (int i = 0; i < filenames.length; i++) {
                mimeBodyPart = new MimeBodyPart();
                DataSource source = new FileDataSource(filepath+"\\"+filenames[i]);
                mimeBodyPart.setDataHandler(new DataHandler(source));
                mimeBodyPart.setFileName(filenames[i]);
                multipart.addBodyPart(mimeBodyPart);
            }
        }
        return multipart;
    }
}
