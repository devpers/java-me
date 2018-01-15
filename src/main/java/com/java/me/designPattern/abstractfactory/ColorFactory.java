package com.java.me.designPattern.abstractfactory;

import org.apache.commons.lang3.StringUtils;

import com.java.me.designPattern.abstractfactory.impl.Blue;
import com.java.me.designPattern.abstractfactory.impl.Red;
import com.java.me.designPattern.abstractfactory.impl.Yellow;


public class ColorFactory extends AbstractFactory{

	@Override
	Object getColor(Class<? extends Color> clazz) {
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
	Color getColor(String color) {
		Color col = null;
		//∑¥…‰ µœ÷
		if(StringUtils.isBlank(color)) {
			return col;
		}
		
		switch (color) {
			case "red":
				col = new Red();
				break;
			case "yellow":
				col = new Yellow();
				break;
			case "blue":
				col = new Blue();
				break;
			default:
				break;
		}
		return col;
	}

	@Override
	Shape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Object getShape(Class<? extends Shape> clazz) {
		// TODO Auto-generated method stub
		return null;
	}

}
