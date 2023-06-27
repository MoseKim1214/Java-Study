package chapter03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point();
		point.setX(100);
		point.setY(80);
		
		drawPoint(point);
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
}
