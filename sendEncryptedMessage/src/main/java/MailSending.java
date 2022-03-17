import java.util.Properties;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;











public class MailSending  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	
	
	
	
	

	
		
		public static void sendMail(String recepient, String msg , int n){
		
		
	    	Properties properties = new Properties();
			
			 properties.put("mail.smtp.auth","true");
		        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		        properties.put("mail.smtp.starttls.enable","true");
		        properties.put("mail.smtp.host","smtp.gmail.com");
		        properties.put("mail.smtp.port","587");
			
			String username = "secured.message.encrypt@gmail.com";
//		        String username = "otp.verify.bank@gmail.com";
			String password = "thamirabarani";
			
			Session session = Session.getInstance(properties,new Authenticator(){
				
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
				
			});
			
			
			
			
				
				
				
				
				Message message=new MimeMessage(session);
				try {
					message.setFrom(new InternetAddress(username));
					message.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
					message.setSubject("This is "+n+" encrypted message...!");
					
//					int rnd = (int) (Math.random()*50000 + Math.random()*50000 + 100000);
					
					
					
					message.setText(msg);
					
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			
				try {
					Transport.send(message);
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} 	
	    	
	    	
	    	
	   
	    	
		 
		 
		 }
		
	

}
