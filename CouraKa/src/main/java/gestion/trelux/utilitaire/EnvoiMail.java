/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion.trelux.utilitaire;

import javax.mail.PasswordAuthentication;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Authenticator;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Fatima
 */
public class EnvoiMail {
    String mail;
    public void sendmail() {
Properties props = new Properties(); //info smtp dans mon exemple lemail expéditeur est en gmail donc j utilise des info de gmail
props.put("mail.smtp.host", "smtp.gmail.com");
props.put("mail.smtp.socketFactory.port", "465");
props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
props.put("mail.smtp.auth", "true");
props.put("mail.smtp.port", "465");
 
Session session = Session.getDefaultInstance(props,new javax.mail.Authenticator() {
 
      //  @Override
	//protected PasswordAuthentication getPasswordAuthentication() {
//	  	return new passwordAuthentication("compte_mail_expéditeur","motdepasse"); // dans cet exemle le compte mail c'est la 1ere partie sans l'@ j c po si ça marche ac
	//}
});
 
try {
 
Message message = new MimeMessage(session);
message.setFrom(new InternetAddress("email expéditeur"));
message.setRecipients(Message.RecipientType.TO,	InternetAddress.parse(mail));  //destinataire
message.setSubject("objet de mail");
message.setText("corps du mail");
 
Transport.send(message);
 
 
} catch (MessagingException e) {
			throw new RuntimeException(e);
}
}
    
}
