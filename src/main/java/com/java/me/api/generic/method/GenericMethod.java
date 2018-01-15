package com.java.me.api.generic.method;

public class GenericMethod {
	
	<T extends Number> GenericMethod(T o){
		System.out.println("grneric method");
	}

	static <T, V extends T> boolean checkEquals(T[] ts, V[] vs) {
		if(ts.length!=vs.length)
			return false;
		
		for(int i=0;i<ts.length;i++)
			if(!ts[i].equals(vs[i]))
				return false;
		
		return true;
	}
	
	public static void main(String args[]) {
		
		Integer t[] = {1,3,5,8,9};
		Integer v[] = {1,3,5,8,9};
		String s[] = {"1","3","5","8","9"};
		Double d[] = {1.2,3.5,5.8,8.5,9.3};
		
		if(checkEquals(t, v)) {
			System.out.println("t same v");
		}
		
		if(checkEquals(t, s)) {
			System.out.println("t same s");
		}
		
		if(checkEquals(t, d)) {
			System.out.println("t same d");
		}
		
	}
}
