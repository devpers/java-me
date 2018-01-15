package com.java.me.api.generic.clazz;

/**
 * ∑∫–Õ¿‡
 * @author Administrator
 *
 * @param <T>
 */
public class Generic<T> {

	T o;
	
	Generic(T o){
		this.o = o;
	}

	void shwoType() {
		System.out.println("T type is "+o.getClass().getName());
	}
	
	public T getO() {
		return o;
	}
	
	
}
