package com.ocja.javadatatypes;

public class ValueTest {
	String a;
	int i;
	Integer in;
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public Integer getIn() {
		return in;
	}
	public void setIn(Integer in) {
		this.in = in;
	}
	
	public static void main(String[] args) {
		System.out.println(new ValueTest().a);
		System.out.println(new ValueTest().i);
		System.out.println(new ValueTest().in);
		Integer a = 10;
		System.out.println("a = " + a);
		Integer b = a;
		b = 30;
		System.out.println(b);
		System.out.println(a);
		
		ValueTest test = new ValueTest();
		System.out.println(test.getI());
		System.out.println(test.getIn());
		
		
		int year;
	}

}
