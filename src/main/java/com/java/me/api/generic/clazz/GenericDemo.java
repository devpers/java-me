package com.java.me.api.generic.clazz;

public class GenericDemo {

	public static void main(String args[]) {
		//generic class
		String a = "TString";
		Generic<String> gs = new Generic<String>(a);
		gs.shwoType();
		System.out.println(gs.getO());
		
		int b = 2018;
		Generic<Integer> gi = new Generic<Integer>(b);
		gi.shwoType();
		System.out.println(gi.getO());
		
		//generic class bounded type
		GenericExtends<Integer> ge = new GenericExtends<Integer>(b);
		System.out.println("����="+ge.reciprocal());
		System.out.println("��="+ge.devide());
		
		GenericExtends<Double> gd = new GenericExtends<Double>(2018.00);
		System.out.println("����="+gd.reciprocal());
		System.out.println("��="+gd.devide());
		
		//generic class ��
		System.out.println(ge.absEquals(gd));
	}
	
	
}
