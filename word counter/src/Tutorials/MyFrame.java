package Tutorials;

import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyFrame extends JFrame implements ActionListener {
	
	JLabel label1,label2;
	JButton btn,btn2;
	JTextArea textarea;
	JScrollPane scrollpane;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800,600);
		this.setTitle("Java GUI Demo");
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.getContentPane().setBackground(new Color(0xDCDCDC));
		
		textarea=new JTextArea("Thanks for viewing!!!!");
		textarea.setBounds(25, 90, 725, 350);
		textarea.setFont(new Font("Arial",Font.PLAIN,18));
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setMargin(new Insets(10,15,10,10));
		
		scrollpane=new JScrollPane(textarea);
		scrollpane.setBounds(25, 90, 725, 350);
		
		label1=new JLabel();
		label1.setBounds(25,25,350,50);
		label1.setFont(new Font("Arial",Font.BOLD,18));
		label1.setForeground(Color.blue);
		
		label2=new JLabel();
		label2.setBounds(450, 25, 350, 50);
		label2.setFont(new Font("Arial",Font.BOLD,18));
		label2.setForeground(Color.blue);
		
		btn=new JButton("Number of words");
		btn.setBounds(25,470,200,50);
		btn.setFont(new Font("Arial",Font.BOLD,16));
		btn.setForeground(Color.blue);
		
		btn2=new JButton("Number of characters");
		btn2.setBounds(550,470,200,50);
		btn2.setFont(new Font("Arial",Font.BOLD,16));
		btn2.setForeground(Color.blue);
		
		btn.addActionListener(this);
		btn2.addActionListener(this);
		
		this.add(scrollpane);
		this.add(label1);
		this.add(label2);
        //this.add(textarea);
        this.add(btn);
        this.add(btn2);
        
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent evt) {
		// TODO Auto-generated method stub
		String str=textarea.getText();
		String words[]=str.split("\\s");
		
		if(evt.getSource()==btn) {
			label1.setText("The number of words is : "+words.length);
			
		}
		else if(evt.getSource()==btn2) {
		
		
		label2.setText("The number of characters is : "+str.length());
		
	}

}
}
