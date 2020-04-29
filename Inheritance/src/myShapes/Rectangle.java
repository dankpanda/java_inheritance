package myShapes;

public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		super();
		width = 1.0;
		length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}

	public Rectangle(String color, boolean filled, double width, double length) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return length * 2 + width * 2;
	}
	
	@Override
	public String toString() {
		return "A rectangle with width = " + width + " and length " + length + " ,which is a subclass of " + super.toString();
	}
}