/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.utilitaire;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendEmail
{
public static void main(String [] args)
{    
    //emetteur----------
     String emetteur = "tifamabv@gmail.com";
     String passwordEmetteur ="Pr0gres4";
    // Recepteur----------
   String destinataire = "tifamabv@gmail.com";

   String host = "smtp.gmail.com";

   // Get system properties
   Properties properties = System.getProperties();
   // Setup mail server 
   properties.put("mail.smtp.starttls.enable", "true");
   properties.put("mail.smtp.host", host);
   properties.put("mail.smtp.user", emetteur);
   properties.put("mail.smtp.password", passwordEmetteur);
   properties.put("mail.smtp.port", "587");
   properties.put("mail.smtp.auth", "true");

   // Get the default Session object.
   Session session = Session.getDefaultInstance(properties);

   try{
      // Create a default MimeMessage object.
      MimeMessage message = new MimeMessage(session);

      // Set From: header field of the header.
      message.setFrom(new InternetAddress(emetteur));

      // Set To: header field of the header.
      message.addRecipient(Message.RecipientType.TO,
                               new InternetAddress(destinataire));

      // Set Subject: header field
      message.setSubject("Inscription ");

      // Now set the actual message
      message.setText("Bonjour cher(e) client(e) bienvenue voici votre compte");

      // Send message
      Transport transport = session.getTransport("smtp");
      transport.connect(host, emetteur, passwordEmetteur);
      transport.sendMessage(message, message.getAllRecipients());
      transport.close();
      System.out.println("message envoié avec succés....");
   }catch (MessagingException mex) {
      mex.printStackTrace();
   }
}
}
