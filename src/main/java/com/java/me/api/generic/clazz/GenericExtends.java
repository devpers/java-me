package com.java.me.api.generic.clazz;

/**
 * ����Լ����
 * @author Administrator
 *
 * @param <T>
 */
public class GenericExtends<T extends Number> {

	T o;
	
	GenericExtends(T o){
		this.o = o;
	}
	
	double reciprocal() {
		return 1/o.doubleValue();
	}
	
	double devide() {
		return o.doubleValue() - o.intValue();
	}
	
	/**
	 * ͨ���/ͨ���Լ��
	 * @param obj
	 * @return
	 */
	boolean absEquals(GenericExtends<? extends Number> obj) {
		if(Math.abs(obj.o.doubleValue())==Math.abs(o.doubleValue())) {
			return true;
		}
		return false;
	}
}
