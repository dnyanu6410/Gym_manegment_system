import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Login {

	public static  void log()
	{
		JFrame ob=new JFrame();
		ob.setSize(700,700);
		
		ob.setTitle("Login");
		
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
		
        Font f=new Font("Serif",Font.BOLD,30);
		
		JLabel name=new JLabel("ABOUT US");
		name.setBounds(250,30,700,50);
		name.setForeground(Color.black);
		name.setFont(f);
		
		p1.add(name);
		
		
		Font f2=new Font("Serif",Font.ITALIC,25);
		JLabel addr=new JLabel("<html>Our goals and be truly satisfied, <br>we must first actively change our  mindset before <br>physically working to our goal.<br> At FitBox Gym in Pimpri Chinchwad, <br>our exceptional professionals help our clients<br> first uncover the power of the Mind before <br>developing the other 2 pillars of<br> health – Nutrition and Training.<br>Our Approach Frustrated with the poor quality <br>of services and lack of support that health clubs <br>have to offer throughout Pune and Pimpri Chinchwad, <br>Founder of  FitBox Gym, Vikram brought<br> a revolutionary and game-changing concept for<br> health and fitness.</html>",SwingConstants.CENTER);
		addr.setBounds(10,60,700,700);
		addr.setFont(f2);
		addr.setForeground(Color.WHITE);
		//.setFont(f);
		p2.add(addr);
		
		
		
	}

	
	public static void main(String[] args) {
		log();
		
	}

}
