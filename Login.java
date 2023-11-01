package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
	
	JButton next,back;
	JTextField tfname;
	
	Login()
	{
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login1.jpg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0,0,500,500);
		add(image);
		
		JLabel heading = new JLabel("Welcome TalentBattle Quiz");
		heading.setBounds(600,60,500,40);
		heading.setFont(new Font("Viner Hand ITC",Font.BOLD,35));
		heading.setForeground(Color.BLUE);
		add(heading);
		
		JLabel name = new JLabel("Enter your name");
		name.setBounds(780,120,300,20);
		name.setFont(new Font("Times New Roman",Font.BOLD,20));
		name.setForeground(Color.BLACK);
		add(name);
		
		tfname = new JTextField();
		tfname.setBounds(700,160,300,25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(tfname);
		
		next = new JButton("Next");
		next.setBounds(730,220,90,30);
		next.setBackground(new Color(30,144,254));
		next.setForeground(Color.WHITE);
		next.addActionListener(this);
		add(next);
		
		back = new JButton("Back");
		back.setBounds(870,220,90,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		setSize(1200,500);
		setLocation(100,150);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==next)
		{
			String name = tfname.getText();
			setVisible(false);
			new Next(name);
		}
		else if(ae.getSource()==back)
		{
			setVisible(false);
		}
		
	}

	public static void main(String[] args) {
		new Login();

	}

}
