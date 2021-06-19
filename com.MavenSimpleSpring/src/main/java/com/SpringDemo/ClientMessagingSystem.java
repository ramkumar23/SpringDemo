package com.SpringDemo;
import com.SpringDemo.Service.MessageService;
import com.SpringDemo.Service.EmailService;
import com.SpringDemo.Service.SMSService;
import com.SpringDemo.Service.TwitterService;
import com.SpringDemo.factory.MessageFactory;

public class ClientMessagingSystem {
	
	private MessageService messageService = MessageFactory.factoryMethod();
	
	public void sendMessage(String address,String message)
	{
		boolean messageStatus=this.messageService.sendMessage(address, message);
		
		if(messageStatus==false)
		{
			System.out.println("Invalid Address");
		}
	}

}
