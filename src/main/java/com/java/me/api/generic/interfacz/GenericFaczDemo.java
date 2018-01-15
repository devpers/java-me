package com.java.me.api.generic.interfacz;

import com.java.me.api.generic.interfacz.impl.GenericFaczImpl;

public class GenericFaczDemo {

	public static void main(String args[]) {
		
		Integer nums[] = {1,3,5,8,9};
		GenericFaczImpl<Integer> gInteger = new GenericFaczImpl<Integer>(nums);
		System.out.println(gInteger.contains(9));
		
//		Double dous[] = {1.2,3.5,5.8,8.5,9.3};
//		GenericFaczImpl<Integer> gDouble = new GenericFaczImpl<Integer>(dous);
//		System.out.println(gInteger.contains(9.0));
		
	}

}
