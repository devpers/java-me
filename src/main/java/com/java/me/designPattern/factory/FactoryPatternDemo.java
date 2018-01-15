package com.java.me.designPattern.factory;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Square square = (Square) shapeFactory.getClass(Square.class);
		square.draw();
		
		Rectangle rectangle = (Rectangle) shapeFactory.getClass(Rectangle.class);
		rectangle.draw();
	}
}
