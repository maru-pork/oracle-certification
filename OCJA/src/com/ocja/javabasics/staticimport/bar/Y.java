package com.ocja.javabasics.staticimport.bar;


//import static com.ocja.javabasics.staticimport.foo.X.LOGICID;
import static com.ocja.javabasics.staticimport.foo.X.*;
import com.ocja.javabasics.staticimport.foo.*;


public class Y {
	
	public static void main(String[] args) {
		X x = new X();
		x.apply(LOGICID);
	}

}
