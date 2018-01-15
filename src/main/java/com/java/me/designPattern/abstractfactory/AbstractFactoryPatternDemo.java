package com.java.me.designPattern.abstractfactory;

import com.java.me.designPattern.abstractfactory.impl.Circle;
import com.java.me.designPattern.abstractfactory.impl.Red;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		
		AbstractFactory colors = (AbstractFactory) FactoryProducer.getFactory("color");
		Color red = (Color) colors.getColor(Red.class);
		red.fill();
		colors.getColor("red").fill();
		
		AbstractFactory shapes = (AbstractFactory) FactoryProducer.getFactory("shape");
		Shape circle = (Shape) shapes.getShape(Circle.class);
		circle.draw();
		shapes.getShape("circle").draw();
	}

}
