package com.ocja.javabasics;

class GarbageCollection {
	private M m = new M();
	
	public void makeItNull (M pm) {
		System.out.println("pm before makeitnull: " + pm);
		pm = null;
		System.out.println("pm after makeitnull: " + pm);
	}
	
	public void makeThisNull() {
		System.out.println("m before makeThisNull: " + m);
		makeItNull(m);
		System.out.println("m after makeThisNull: " + m);
	}
	
	public static void main(String[] args) {
		GarbageCollection n = new GarbageCollection();
		n.makeThisNull();
		
		n = null;
		// n.m calls null pointer exception
		
		/*
		 * m before makeThisNull: com.ocja.day1.M@3da3da69
		 * pm before makeitnull: com.ocja.day1.M@3da3da69
		 * pm after makeitnull: null
		 * m after makeThisNull: com.ocja.day1.M@3da3da69
		 * */
	}
}

class M {
	
	
}
