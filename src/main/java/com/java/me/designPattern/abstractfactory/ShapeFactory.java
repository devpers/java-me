package com.java.me.designPattern.abstractfactory;

import org.apache.commons.lang3.StringUtils;

import com.java.me.designPattern.abstractfactory.impl.Circle;
import com.java.me.designPattern.abstractfactory.impl.Rectangle;
import com.java.me.designPattern.abstractfactory.impl.Square;

public class ShapeFactory extends AbstractFactory{

	@Override
	Object getShape(Class<? extends Shape> clazz) {
		Object object = null;
		try {
			object = Class.forName(clazz.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
	
	@Override
	Shape getShape(String shape) {
		Shape sha = null;
		
		if(StringUtils.isBlank(shape)) {
			return sha;
		}
		
		switch (shape) {
			case "circle":
				sha = new Circle();
				break;
			case "square":
				sha = new Square();
				break;
			case "rectangle":
				sha = new Rectangle();
				break;
			default:
				break;
		}
		return sha;
	}
	
	@Override
	Color getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Object getColor(Class<? extends Color> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
