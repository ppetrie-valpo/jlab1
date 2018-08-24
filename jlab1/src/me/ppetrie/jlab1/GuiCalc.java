package me.ppetrie.jlab1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GuiCalc implements ActionListener {
	
	private JFrame frame;
	private JPanel xpanel;
	private JLabel x;
	private JTextField xfield;
	private JPanel ypanel;
	private JLabel y;
	private JTextField yfield;
	private JLabel rslt;
	private JButton computeButton;
	
	public GuiCalc() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		xpanel = new JPanel();
		
		x = new JLabel("x:");
		xpanel.add(x);
		
		xfield = new JTextField("", 5);
		xpanel.add(xfield);
		
		frame.add(xpanel);
		
		ypanel = new JPanel();
		
		y = new JLabel("y:");
		ypanel.add(y);
		
		yfield = new JTextField("", 5);
		ypanel.add(yfield);
		
		frame.add(ypanel);
		
		rslt = new JLabel("x * y = ");
		frame.add(rslt);
		
		computeButton = new JButton("Compute");
		frame.add(computeButton);
		computeButton.addActionListener(this);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		int xval, yval;
		try {
			xval = Integer.valueOf(xfield.getText());
			yval = Integer.valueOf(yfield.getText());
		} catch(NumberFormatException nfe) {
			xval = 0;
			yval = 0;
		}
		rslt.setText("x * y = " + xval * yval);
	}
	
}
