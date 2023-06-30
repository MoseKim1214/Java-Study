package com.bitacademy.paint.main;

import com.bitacademy.paint.i.Drawable;
import com.bitacademy.paint.point.ColorPoint;
import com.bitacademy.paint.point.Point;
import com.bitacademy.paint.text.GraphicText;

import com.bitacademy.paint.shape.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point point = new Point();
		point.setX(100);
		point.setY(80);
		
		//drawPoint(point);
		draw(point);
		point.show(false);
		
//		Point point2 = new ColorPoint();
//		point2.setX(2000);
//		point2.setY(1001);
		
		Point point2 = new ColorPoint(2000,1000, "red");
		
		//(ColorPoint)point3.setColor("red"); .이 우선순위가 높아서 에러
		
		((ColorPoint)point2).setColor("red");
		

		//drawPoint(point2);
		draw(point2);
		
		System.out.println(point2.toString());
		
		
		
		Rectangle rectangle = new Rectangle();
		//drawShape(rectangle);
		draw(rectangle);
		
		Circle circle = new Circle();
		//drawShape(circle); 
		draw(circle);
		
		
		GraphicText gt = new GraphicText("Hellow World");
		draw(gt);
	}
	
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	
	public static void drawPoint(Point point) {
		point.show();
	}
	
	
	
	
//	public static void drawShape(Shape shape) {
//		shape.draw();
//	}
//	public static void drawRectangle(Rectangle rectangle) {
//		rectangle.draw();
//	}
	
	//부모로 참조할 수 있어야하기 때문에 이러면 털림
//	public static void drawColorPoint(ColorPoint colorPoint) {
//		colorPoint.show();
//	}
	
}
