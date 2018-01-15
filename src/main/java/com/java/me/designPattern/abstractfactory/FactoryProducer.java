package com.java.me.designPattern.abstractfactory;

import org.apache.commons.lang3.StringUtils;

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryKind) {
		
		if(StringUtils.isBlank(factoryKind))
			return null;
		
		if(factoryKind.equalsIgnoreCase("color"))
			return new ColorFactory();
		
		if(factoryKind.equalsIgnoreCase("shape"))
			return new ShapeFactory();
		
		return null;
	}
}
