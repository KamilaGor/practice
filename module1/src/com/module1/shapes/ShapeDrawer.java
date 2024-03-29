package com.module1.shapes;

import com.module1.shapes.Shape;

public class ShapeDrawer {

	private Shape shape;

	public ShapeDrawer(Shape shape) {
		this.shape = shape;
	}

	public void process() {
		System.out.println("Starting to draw the chosen shape...");
		this.shape.draw();
		System.out.println("Shape has been drawn");
	}
}
