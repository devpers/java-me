package com.java.me.api.generic.clazz;

/**
 * ���ͣ���������β���
 * @author Administrator
 *
 * @param <T>
 */
public class GenericTV<T, V> {

	T t;
	
	V v;
	
	GenericTV(T t, V v){
		this.t = t;
		this.v = v;
	}
	
	void checkEquals() {
		
	}
}
