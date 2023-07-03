package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
		
	}
	
	@Override	
	public void resize(double s) {
		width = width*s;
		height = height*s;

	}

	@Override
	public double getArea() {
		double area = width * height;
		return area;
	}

	@Override
	public double getPerimeter() {
		
		return 2*(width + height);
	}

}
