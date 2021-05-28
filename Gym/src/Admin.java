import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Admin {

	public static void run()
	{
		JFrame ob=new JFrame();
		ob.setSize(700,700);
		
		ob.setTitle("Admin");
		
		ob.setResizable(false);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p1,p2;
		p1=new JPanel();
		p1.setLayout(null);
		//p1.setLayout(null);
		p1.setBounds(0,0,700,150);
		p1.setBackground(Color.pink);
		ob.add(p1);
		
		p2=new JPanel();
		p2.setLayout(null);
		p2.setSize(700,700);
		p2.setBackground(Color.black);
		//p2.setBounds(10, 10, 400, 400);
		ob.add(p2);

		
		//label tital
        Font f=new Font("Serif",Font.BOLD,30);
		
		JLabel name=new JLabel("INFORMATION");
		name.setBounds(250,30,700,50);
		name.setForeground(Color.black);
		name.setFont(f);
		
		p1.add(name);
		
		//Delete button
		
		JButton d=new JButton("Delete");
		d.setBounds(270,250,150,60);
		d.setBackground(Color.green);
		d.setForeground(Color.black);
		d.setFont(new Font("Serif",Font.BOLD,20));
		
        d.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e)
			{
				Delete d=new Delete();
				d.delete(0);
			}
			
			
		});
		p2.add(d);
		
		
		JButton v=new JButton("Update");
		v.setBounds(270,400,150,60);
		v.setBackground(Color.blue);
		v.setForeground(Color.black);
		v.setFont(new Font("Serif",Font.BOLD,20));
		 v.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
				
					
				}
				
				
			});
		p2.add(v);
		
		JButton u=new JButton("View");
		u.setBounds(270,550,150,60);
		u.setBackground(Color.yellow);
		u.setForeground(Color.black);
		u.setFont(new Font("Serif",Font.BOLD,20));
		 u.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e)
				{
					System.out.println("view");
					demo d=new demo();
					
					
				}
				
				
			});
		p2.add(u);
		
		
	}
	public static void main(String[] args) {
		run();

	}

}
