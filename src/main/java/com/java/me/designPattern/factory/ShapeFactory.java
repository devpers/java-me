package com.java.me.designPattern.factory;

/**
 * 形状工厂
 * @author Administrator
 *
 */
public class ShapeFactory {

	public Object getClass(Class<? extends Shape> clazz) {
		Object object = null;
		try {
			//反射实现
			object = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
