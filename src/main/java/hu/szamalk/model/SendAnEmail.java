/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hu.szamalk.model;

import java.util.Properties;
import javax.activation.*;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


/**
 *
 * @author Roland
 */
public class SendAnEmail {

    public static void main(String[] args) {
       // "xlns bjfp mdwq wfgf"
       EmailService email = new EmailService(
               "smtp.gmail.com", "465", "elekt843@gmail.com", "xlns bjfp mdwq wfgf");
        try {
            email.sendMail("Rolandszb111@gmail.com", "Yes", "<h1>Yeahha</h1>", "files", new String[]{"g1.txt", "g2.txt"});
        } catch (Exception e) {
            System.out.println("Hiba");
            System.out.println(e.getMessage());
        }
    }
}
