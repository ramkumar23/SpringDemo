package com.SpringDemo.factory;

import java.util.Scanner;

import com.SpringDemo.Service.EmailService;
import com.SpringDemo.Service.MessageService;
import com.SpringDemo.Service.SMSService;
import com.SpringDemo.Service.TwitterService;

public class MessageFactory {
	
	
	private static MessageService messageService = null;
	
	public static MessageService factoryMethod() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the option :\n1.SMS servive \n2.Email Service \n3.Twitter Service");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
				messageService = new SMSService();
				break;
		case 2:
				messageService = new EmailService();
				break;
		case 3:
				messageService = new TwitterService();
				break;
		
		default:
			 System.out.println("Invalid option");
			 break;
		}
		
		return messageService;
	}
	
}
