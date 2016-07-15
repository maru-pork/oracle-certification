package com.staticimport.bar;


//import static com.staticimport.foo.X.LOGICID;
import static com.staticimport.foo.X.*;
import com.staticimport.foo.*;


public class Y {
	
	public static void main(String[] args) {
		X x = new X();
		x.apply(LOGICID);
	}

}
