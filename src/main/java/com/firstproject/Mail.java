package com.firstproject;

import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Mail {
	
	public boolean sendmail(User user) {
		
		Properties properties=new Properties();
		properties.put("mail.smtp.auth","true" );
		properties.put("mail.smtp.starttls.enable","true");
		properties.put("mail.smtp.starttls.required", "true");
		properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
		properties.put("mail.smtp.host","smtp.gmail.com");
		properties.put("mail.smtp.port","587");
		String username="sundarav61@gmail.com";
		String password="sxeyduoesihmshlh";
		String recepient=user.getEmail();
		Session session=Session.getInstance(properties,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username,password);
			}
		});
	    String code=user.getCode();
		Message message=prepareMessage(session,username,recepient,code);
		try {
			
			Transport.send(message);
			return true;
		}
		catch(Exception e)
		{
			
			e.printStackTrace();
			return false;
		}
		
	}

	private static Message prepareMessage(Session session, String username, String recepient,String code) {
		// TODO Auto-generated method stub
		Message message=new MimeMessage(session);
		
		try {
			message.setFrom(new InternetAddress(username));
			message.setRecipient(Message.RecipientType.TO,new InternetAddress(recepient));
			message.setSubject("Verification code");
			message.setText("Registered successfully.Please Verify your account using this code:"+code);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return message;
	}

}

