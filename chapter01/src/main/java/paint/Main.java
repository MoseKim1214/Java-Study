package paint;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point();
		point.setX(100);
		point.setY(80);
		
		drawPoint(point);
		point.show(false);
		
//		Point point2 = new ColorPoint();
//		point2.setX(2000);
//		point2.setY(1001);
		
		Point point2 = new ColorPoint(2000,1000, "red");
		
		//(ColorPoint)point3.setColor("red"); .이 우선순위가 높아서 에러
		
		((ColorPoint)point2).setColor("red");
		

		drawPoint(point2);
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
	
	
	//부모로 참조할 수 있어야하기 때문에 이러면 털림
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	
}
