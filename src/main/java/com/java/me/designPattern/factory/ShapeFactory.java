package com.java.me.designPattern.factory;

/**
 * ��״����
 * @author Administrator
 *
 */
public class ShapeFactory {

	public Object getClass(Class<? extends Shape> clazz) {
		Object object = null;
		try {
			//����ʵ��
			object = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
