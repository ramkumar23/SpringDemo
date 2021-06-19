package com.SpringDemo;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class App 
{
    public static void main( String[] args )
    {
    	ClientMessagingSystem cms= new ClientMessagingSystem();
    	Scanner scanner = new Scanner(System.in);
        System.out.println( "enter your address " );
        String addr=scanner.nextLine();
        System.out.println( "enter your message" );
        String msg=scanner.nextLine();
        cms.sendMessage(addr, msg);
    }
}

/*
public class App extends JFrame
{
	Container container;
	JLabel lUserId, lPassword, lMessage,ltitle;
	static JTextField tUserId;
	static JTextField tPassword;
	private static JFrame f;
	JButton bLogin, bRegister;
	/////
	public App() throws ClassNotFoundException, SQLException {
		f=new JFrame();
		container=getContentPane();
		lUserId=new JLabel("enter address");
		lPassword=new JLabel("enter message");
		ltitle=new JLabel("Messsaging service");
		lMessage=new JLabel();
		tUserId=new JTextField();
		tPassword=new JTextField();
		bLogin=new JButton("send");
		
		//Event handling for Login button
		bLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String userId,password;
				
				userId=tUserId.getText();
				password=tPassword.getText();
				ClientMessagingSystem cms=new ClientMessagingSystem();
		    	//Scanner sc=new Scanner(System.in);
		    	//System.out.println("Enter your address ");
		    	//String address=sc.nextLine();
		    	//System.out.println("Enter your message ");
		    	//String message=sc.nextLine();
				cms.sendMessage(userId, password);
				
			}
		});
		
		
		
	
		
	
		setLayoutManager();
		setLocationAndSize();
		addComponentsToContainer();
		this.setTitle("Message service System");
		this.setVisible(true);
		this.setBounds(300,200,500,500);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
	}
	public void setLayoutManager() {
		container.setLayout(null);
	}
	public void setLocationAndSize() {
		ltitle.setBounds(120, 75, 150, 30);
		lUserId.setBounds(50, 150, 100, 30);
		lPassword.setBounds(50, 250, 100, 30);
		tUserId.setBounds(250, 150, 150, 30);
		tPassword.setBounds(250, 250, 150, 30);
		bLogin.setBounds(100, 350, 100, 30);
	
	}
	public void addComponentsToContainer() {
		container.add(ltitle);
		container.add(lUserId);
		container.add(tUserId);
		container.add(lPassword);
		container.add(tPassword);
		container.add(bLogin);
		
		
	
	}

	
	/////
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
    	
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    
    	
    	
       
    }
	public static void tsendMessage(String info) {
		
		
		JOptionPane.showMessageDialog(f,info);
		
		
	}
}

*/
