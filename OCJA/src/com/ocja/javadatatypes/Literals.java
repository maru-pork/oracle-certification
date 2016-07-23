package com.ocja.javadatatypes;

public class Literals {
	
	boolean t = true;
	boolean f = false;
	
	char chara = 'a';
	char charb = '\u0000';
	char charc = 65535;
	
	byte bytea = -128;
	byte byteb = 127;
	
	short shorta = -32768;
	short shortb = 32767;
	
	
	public static void main(String[] args) {
		System.out.println(new Literals().charb);
		System.out.println("Character max value: " + (Character.MAX_VALUE + 0));
		System.out.println("Byte max value: " + Byte.MAX_VALUE);
		System.out.println("Short max value: " + Short.MAX_VALUE);
		System.out.println("Integer max value: " + Integer.MAX_VALUE);
		System.out.println("Long max value: " + Long.MAX_VALUE);
		System.out.println("Float max value: " + Float.MAX_VALUE);
		System.out.println("Double max value: " + Double.MAX_VALUE);
		
		int binary = 0B1;
		int dec = 1;
		int octal = 01;
		int hexa = 0XF;
		
		float octalf = 01f;
		long hexl = 0X1l;
		
		double underscore = 1_111_000.00;
		
		char chara = 65535;
		long a = chara;
		char c = (char) a;
		
		System.out.println(c + 0);
		long longa = 123669;
		
		float floata = 1.3f;
		
		byte one = 1;
		byte two = 2;
		byte sum = (byte) (one + two);
		
		long l = 130L;
		byte b = (byte) l;
		System.out.println(b);
		
		
		float f = 234.56F;
		short s = (short) f;
		/**
		 * integer literals = int default
		 * floating point literals = double default
		 */
	}
	

}
