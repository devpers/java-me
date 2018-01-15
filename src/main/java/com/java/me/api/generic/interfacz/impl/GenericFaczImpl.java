package com.java.me.api.generic.interfacz.impl;

import com.java.me.api.generic.interfacz.GenericFacz;

public class GenericFaczImpl<T> implements GenericFacz<T>{

	T[] arrays;
	
	public GenericFaczImpl(T[] objs){
		this.arrays = objs;
	}
	
	@Override
	public boolean contains(T param) {
		// TODO Auto-generated method stub
		for(T t:arrays) 
			if(t.equals(param)) return true;
		return false;
	}

	
}
