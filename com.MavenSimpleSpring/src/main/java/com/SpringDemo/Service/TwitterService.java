package com.SpringDemo.Service;
import com.SpringDemo.App;

public class TwitterService implements MessageService {
	
	public boolean sendMessage(String address,String message) {
		
		boolean messageStatus=false;
		String info;
		if(address.contains("@") && message.length()<=50)
		{
			messageStatus=true;
			info="the TwitterService  message is"+message+" send to "+address+"";
			System.out.println("The TwitterService  Message is :" + message + " sent to " + address + "");
			
			
		}else {
		info="Invalid sms address";
		}
		//App.tsendMessage(info);
	

		
		return messageStatus;
	}

}
