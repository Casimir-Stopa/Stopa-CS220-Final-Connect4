package knox.Connect4;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class Connect4GUI extends JFrame {
	// make Connect4
	Connect4 b;
	
	JFrame f; 

	
	JPanel p1 = new JPanel();
    JButton drop1 = new JButton("drop in 1");
    
    JPanel p2 = new JPanel();
    JButton drop2 = new JButton("drop in 2");
    
    JPanel p3 = new JPanel();
    JButton drop3 = new JButton("drop in 3");
    
    JPanel p4 = new JPanel();
    JButton drop4 = new JButton("drop in 4");
    
    JPanel p5 = new JPanel();
    JButton drop5 = new JButton("drop in 5");
	
	JPanel p6 = new JPanel();
    JButton drop6 = new JButton("drop in 6");
    
    JPanel p7 = new JPanel();
    JButton drop7 = new JButton("drop in 7");
    
    JPanel r11 = new JPanel();
    JPanel r12 = new JPanel();
    JPanel r13 = new JPanel();
    JPanel r14 = new JPanel();
    JPanel r15 = new JPanel();
    JPanel r16 = new JPanel();
    JPanel r17 = new JPanel();

    
    JPanel r21 = new JPanel();
    JPanel r22 = new JPanel();
    JPanel r23 = new JPanel();
    JPanel r24 = new JPanel();
    JPanel r25 = new JPanel();
    JPanel r26 = new JPanel();
    JPanel r27 = new JPanel();
    
    JPanel r31 = new JPanel();
    JPanel r32 = new JPanel();
    JPanel r33 = new JPanel();
    JPanel r34 = new JPanel();
    JPanel r35 = new JPanel();
    JPanel r36 = new JPanel();
    JPanel r37 = new JPanel();

    JPanel r41 = new JPanel();
    JPanel r42 = new JPanel();
    JPanel r43 = new JPanel();
    JPanel r44 = new JPanel();
    JPanel r45 = new JPanel();
    JPanel r46 = new JPanel();
    JPanel r47 = new JPanel();
    
    JPanel r51 = new JPanel();
    JPanel r52 = new JPanel();
    JPanel r53 = new JPanel();
    JPanel r54 = new JPanel();
    JPanel r55 = new JPanel();
    JPanel r56 = new JPanel();
    JPanel r57 = new JPanel();

    JPanel r61 = new JPanel();
    JPanel r62 = new JPanel();
    JPanel r63 = new JPanel();
    JPanel r64 = new JPanel();
    JPanel r65 = new JPanel();
    JPanel r66 = new JPanel();
    JPanel r67 = new JPanel();

	
	
    JMenuBar menuBar;
	Connect4GUI() {
		
		f = this;
		b = new Connect4();
		
		setTitle("Connect 4");
		f.setSize(500, 500);
    	f.setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	f.setLayout(new GridLayout(7, 2));
    	p1.add(drop1);
		p1.setSize(100, 100);

		p2.add(drop2);
		p2.setSize(100, 100);
		
		p3.add(drop3);
		p3.setSize(100, 100);
		
		p4.add(drop4);
		p4.setSize(100, 100);
		
		p5.add(drop5);
		p5.setSize(100, 100);
		
		p6.add(drop6);
		p6.setSize(100, 100);
		
		p7.add(drop7);
		p7.setSize(100, 100);
		
		r11.setBackground(Color.BLUE);
		r11.setSize(100, 100);
		
		
		r12.setBackground(Color.BLUE);
		r12.setSize(100, 100);
		r13.setBackground(Color.BLUE);
		r13.setSize(100, 100);
		r14.setBackground(Color.BLUE);
		r14.setSize(100, 100);
		r15.setBackground(Color.BLUE);
		r15.setSize(100, 100);
		r16.setBackground(Color.BLUE);
		r16.setSize(100, 100);
		r17.setBackground(Color.BLUE);
		r17.setSize(100, 100);


		r21.setBackground(Color.BLUE);
		r21.setSize(100, 100);
		r22.setBackground(Color.BLUE);
		r22.setSize(100, 100);
		r23.setBackground(Color.BLUE);
		r23.setSize(100, 100);
		r24.setBackground(Color.BLUE);
		r24.setSize(100, 100);
		r25.setBackground(Color.BLUE);
		r25.setSize(100, 100);
		r26.setBackground(Color.BLUE);
		r26.setSize(100, 100);
		r27.setBackground(Color.BLUE);
		r27.setSize(100, 100);
		
		r31.setBackground(Color.BLUE);
		r31.setSize(100, 100);
		r32.setBackground(Color.BLUE);
		r32.setSize(100, 100);
		r33.setBackground(Color.BLUE);
		r33.setSize(100, 100);
		r34.setBackground(Color.BLUE);
		r34.setSize(100, 100);
		r35.setBackground(Color.BLUE);
		r35.setSize(100, 100);
		r36.setBackground(Color.BLUE);
		r36.setSize(100, 100);
		r37.setBackground(Color.BLUE);
		r37.setSize(100, 100);
		
		r41.setBackground(Color.BLUE);
		r41.setSize(100, 100);
		r42.setBackground(Color.BLUE);
		r42.setSize(100, 100);
		r43.setBackground(Color.BLUE);
		r43.setSize(100, 100);
		r44.setBackground(Color.BLUE);
		r44.setSize(100, 100);
		r45.setBackground(Color.BLUE);
		r45.setSize(100, 100);
		r46.setBackground(Color.BLUE);
		r46.setSize(100, 100);
		r47.setBackground(Color.BLUE);
		r47.setSize(100, 100);
		
		r51.setBackground(Color.BLUE);
		r51.setSize(100, 100);
		r52.setBackground(Color.BLUE);
		r52.setSize(100, 100);
		r53.setBackground(Color.BLUE);
		r53.setSize(100, 100);
		r54.setBackground(Color.BLUE);
		r54.setSize(100, 100);
		r55.setBackground(Color.BLUE);
		r55.setSize(100, 100);
		r56.setBackground(Color.BLUE);
		r56.setSize(100, 100);
		r57.setBackground(Color.BLUE);
		r57.setSize(100, 100);
		
		r61.setBackground(Color.BLUE);
		r61.setSize(100, 100);
		r62.setBackground(Color.BLUE);
		r62.setSize(100, 100);
		r63.setBackground(Color.BLUE);
		r63.setSize(100, 100);
		r64.setBackground(Color.BLUE);
		r64.setSize(100, 100);
		r65.setBackground(Color.BLUE);
		r65.setSize(100, 100);
		r66.setBackground(Color.BLUE);
		r66.setSize(100, 100);
		r67.setBackground(Color.BLUE);
		r67.setSize(100, 100);
		
	
		
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		f.add(p5);
		f.add(p6);
		f.add(p7);

		
		f.add(r11);
		f.add(r12);
		f.add(r13);
		f.add(r14);
		f.add(r15);
		f.add(r16);
		f.add(r17);
		
		f.add(r21);
		f.add(r22);
		f.add(r23);
		f.add(r24);
		f.add(r25);
		f.add(r26);
		f.add(r27);
		
		f.add(r31);
		f.add(r32);
		f.add(r33);
		f.add(r34);
		f.add(r35);
		f.add(r36);
		f.add(r37);
		
		f.add(r41);
		f.add(r42);
		f.add(r43);
		f.add(r44);
		f.add(r45);
		f.add(r46);
		f.add(r47);
		
		f.add(r51);
		f.add(r52);
		f.add(r53);
		f.add(r54);
		f.add(r55);
		f.add(r56);
		f.add(r57);
		
		f.add(r61);
		f.add(r62);
		f.add(r63);
		f.add(r64);
		f.add(r65);
		f.add(r66);
		f.add(r67);
		
		
        f.setResizable(true);
        f.pack();
        f.setLocation(100,100);
        f.setFocusable(true);

		repaint();

		
	 
    
	}
	
    
}
