package prob6;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	
	@Override
	public double getArea() {
		
		double area =  (width*height)*0.5;
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double hypotenuse = Math.sqrt(width*width + height*height);
		return hypotenuse + width + height;
	}

}
