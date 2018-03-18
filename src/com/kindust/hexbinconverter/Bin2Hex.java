package com.kindust.hexbinconverter;

public class Bin2Hex {
	
	public Bin2Hex() {
		
	}
	
	public Long convert(String Hex) {
		long out = 0L;
		int max = Hex.length();
		if(!isValid(Hex)) {
			return -1L;
		}
		for(int i = 0; i < max; i++) {
			char a = Hex.charAt(i);
				switch(a) {
				case 'a':
					out += 10*raise(i,max-1);
					break;
				case 'b':
					out += 11*raise(i,max-1);
					break;
				case 'c':
					out += 12*raise(i,max-1);
					break;
				case 'd':
					out += 13*raise(i,max-1);
					break;
				case 'e':
					out += 14*raise(i,max-1);
					break;
				case 'f':
					out += 15*raise(i,max-1);
					break;
				default:
					out += ((int)Character.getNumericValue(a))*raise(i,max-1);
					System.out.println("defCase "+a);
			}
			System.out.println("::"+out);
		}
		
		return out;
	}
	private double raise(int i,int max) {
		double a = Math.pow(16.0d, (double) max-i);
		System.out.println(a);
		return a;
	}
	private boolean isValid(String in) {
		for ( int i = 0; i < in.length() ; i++ ) {
	        if ( Character.digit(in.charAt(i), 16) == -1 ) {
	        	return false;
	        }
		}
		return true;
	}
}
