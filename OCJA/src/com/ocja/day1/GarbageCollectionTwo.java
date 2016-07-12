package com.ocja.day1;

public class GarbageCollectionTwo {
	
	private Object o;
	void doSomething(Object s) {
		System.out.println("o original: " + o);
		o = s;
		System.out.println("o amended: " + o);
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println("object line 14: " + obj);
		GarbageCollectionTwo newClass = new GarbageCollectionTwo();
		newClass.doSomething(obj);
		System.out.println("object line 16: " + obj);
		obj = new Object();
		System.out.println("object line 18: " + obj);
		obj = null;
		System.out.println("object line 20: " + obj);
		newClass.doSomething(obj);
		System.out.println("object line 22: " + obj);
		
		/*
		 * object line 14: java.lang.Object@157ee3e5
		 * o original: null
		 * o amended: java.lang.Object@157ee3e5
		 * object line 16: java.lang.Object@157ee3e5
		 * object line 18: java.lang.Object@3da3da69
		 * object line 20: null
		 * o original: java.lang.Object@157ee3e5
		 * o original: null
		 * object line 22: null
		 */
	}

}
