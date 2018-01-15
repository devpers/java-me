package com.java.me.api.generic.interfacz;

/**
 * 泛型接口约束
 * @author Administrator
 *
 * @param <T>
 */
public interface GenericFaczExtends<T extends Number> {

	boolean contains(T o);
}
