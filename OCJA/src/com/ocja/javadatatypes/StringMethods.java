package com.ocja.javadatatypes;

public class StringMethods {
	
	public static void main(String[] args) {
		String text = "String";
		
		char resultCharAt = text.charAt(0);
		System.out.printf("%s| %s", "char charAt(int index)", resultCharAt);
		
		int resultCodePointAt = text.codePointAt(0);
		System.out.printf("\n%s| %s", "int codePointAt(int index)", resultCodePointAt);
		
		char[] array2 = new char[]{'1','2','3','4','5','6','7','8'};
		text.getChars(1, 5, array2, 2);
		for (char temp : array2) {
			System.out.printf("\ngetChars %s", temp);
		}
		
		System.out.printf("\n%b", "String".equals(text));
		System.out.printf("\n%b", "text".equals(text));
		
		System.out.println(text.codePointAt(1));
		System.out.println(text.codePointAt(2));
		
		System.out.println("S".compareTo("t"));
		
		String value = "0123456789";
		System.out.println(value.substring(3, 10));
		
		System.out.println(text.indexOf("S",0));
		System.out.println(text.indexOf(83,0));
		
		int million = 100_000_000;
		
		byte b = 0;
		short s = 0;
		int i = 0;
		long l = 0;
		float f = 0;
		double d = 0;
		
		int x = 13;        
        double y = x;
        
        double doube = 0.0;
        int inte = (int) doube;
        
        String myStr = "good"; 
        char[] myCharArr = {'g', 'o', 'o', 'd' }; 
        String newStr = ""; 
        for(char ch : myCharArr){
        	newStr = newStr + ch;
        }  
        System.out.println(myStr);
        System.out.println(newStr);
        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
        
        String goodOne = "good";
        String goodTwo = "good";
        
        StringBuilder sb = new StringBuilder("builder");
        System.out.println(sb.substring(0, 1));

        
        System.out.println(goodOne == goodTwo);

	}

}
