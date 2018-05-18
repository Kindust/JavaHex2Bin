package com.kindust.hexdecconverter;

import javax.swing.JOptionPane;

public class Main {
	static Hex2Dec b2h;
	public static void main(String[] args) {
		while(true) {
			b2h=new Hex2Dec();
			String s = " ";
			s= JOptionPane.showInputDialog(null,"Please input your hexadecimal value:", "Kindust Hex2Bin [FOR INTERNAL USE ONLY]", JOptionPane.PLAIN_MESSAGE);
			long l = b2h.convert(s);
			System.out.println("Your input: "+s+".  Your output: "+l); 
			if(l!=-1) {
				JOptionPane.showMessageDialog(null, "Your input was: "+s+".  Your output is: "+l, "Kindust Hex2Bin [FOR INTERNAL USE ONLY]", JOptionPane.PLAIN_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(null, "Invalid input!", "Kindust Hex2Bin", JOptionPane.PLAIN_MESSAGE);
			}
		}
	}

}
