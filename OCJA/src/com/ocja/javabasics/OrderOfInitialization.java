package com.ocja.javabasics;

public class OrderOfInitialization {
	
	// constructor
	public OrderOfInitialization() {
		System.out.println("constructor");
	}
	
	// static initializer
	static {
		System.out.println("static");
	}

	static A  sa1 = new A(1);
	A a = new A(2);
		
	public static void print() {
		System.out.println("print");
	}
	
	public static void main(String[] args) {
		OrderOfInitialization b = new OrderOfInitialization();
		A a = new A(3);		
		/*
		 * static
		 * 1
		 * 4
		 * 2
		 * constructor
		 * 3
		 * */
	}
	
	static A sa2 = new A(4);

}

class A {
	
	public A() {
		
	}
	
	 public A(int i) {
		 System.out.println(i);
	 }
	
}