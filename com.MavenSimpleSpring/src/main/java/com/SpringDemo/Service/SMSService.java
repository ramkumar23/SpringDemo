package com.SpringDemo.Service;
import javax.swing.JOptionPane;

import com.SpringDemo.App;
public class SMSService implements MessageService {
	
	public boolean sendMessage(String address,String message) {
		String regex="\\d{10}";
		boolean messageStatus=false;
		String info;
		if(address.matches(regex))
		{
			messageStatus=true;
			info="the SMS service message is"+message+" send to "+address+"";
			System.out.println("The Sms Message is :" + message + " sent to " + address + "");
			
			
		}else {
		info="Invalid sms address";
		}
		//App.tsendMessage(info);
	

		
		return messageStatus;
	}

}
