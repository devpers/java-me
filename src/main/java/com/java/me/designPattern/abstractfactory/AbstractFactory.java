package com.java.me.designPattern.abstractfactory;

/**
 * ���󹤳���
 * @author Administrator
 *
 */
public abstract class AbstractFactory {

	abstract Color getColor(String color);
	
	abstract Shape getShape(String shape);
	
	abstract Object getColor(Class<? extends Color> clazz);
	
	abstract Object getShape(Class<? extends Shape> clazz);
}
