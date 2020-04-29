package myShapes;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side,side);
	}

	public Square(double width, double length) {
		super(width, length);
	}

	public Square(String color, boolean filled, double side) {
		super(color, filled, side, side);
	}
	
	public double getSide() {
		return this.getWidth();
	}
	
	public void setSide(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	
	@Override
	public void setWidth(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	
	@Override
	public void setLength(double side) {
		this.setWidth(side);
		this.setLength(side);
	}
	
	@Override
	public String toString() {
		return "A square with side = " + this.getSide() + " which is a subclass of " + super.toString();
	}
}
