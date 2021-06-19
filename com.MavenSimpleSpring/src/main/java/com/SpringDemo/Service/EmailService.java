package com.SpringDemo.Service;
import com.SpringDemo.App;

public class EmailService implements MessageService {
	
	public boolean sendMessage(String address,String message) {
		String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
		boolean messageStatus=false;
		String info;
		if(address.matches(regex))
		{
			messageStatus=true;
			info="the EmailService message is"+message+" send to "+address+"";
			System.out.println("The EmailService is :" + message + " sent to " + address + "");
			
			
		}else {
		info="Invalid sms address";
		}
		//App.tsendMessage(info);
	

		
		return messageStatus;
	}

}
