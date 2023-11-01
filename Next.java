package quiz.application;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class Next extends JFrame implements ActionListener {
	String name;
	JButton back,start;
	Next(String name)
	{
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading = new JLabel("Welcome "+name+" to Talent Battle");
		heading.setBounds(50,20,350,40);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,18));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel rules = new JLabel();
		rules.setBounds(30,50,600,400);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText(
				
				"<html>"+ 
		                "1. Read all the following instructions properly. Keep your Admit card with you." + "<br><br>" +
		                "2. You should not use mobile phones while attending the quiz" + "<br><br>" +
		                "3. Here all the questions are compulsory." + "<br><br>" +
		                "4. Each question have a time limit, if you are not submitting it with in the time limit it will move to the next question." + "<br><br>" +
		                "5. Any kind of malpractice will be not be encouraged. And you will be disqualified" + "<br><br>" +
		                "6. All the best for your competiotion, Good Luck!!!" + "<br><br>" +
		         "<html>"
		);
	
		add(rules);
		
		back = new JButton("Back");
		back.setBounds(150,450,90,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		start = new JButton("Start");
		start.setBounds(400,450,90,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);	
		
		setSize(750,600);
		setLocation(330,100);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==start)
		{
			setVisible(false);
			new Quiz(name);
		}
		else
		{
			setVisible(false);
			new Login();
		}
	}

	public static void main(String[] args) {
		
		new Next("User");

	}

}
