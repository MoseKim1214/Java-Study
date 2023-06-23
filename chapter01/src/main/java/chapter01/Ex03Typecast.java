package chapter01;

public class Ex03Typecast {

	public static void main(String[] args) {
		int i1 = 10;
		long l1 = 1000L;
		
		float f1 = 3.14f;
		double d1 = 3.15;
		
		//명시적 타입 캐스트 (explicit)
		int i2 = (int) l1; 
		float f2 = (float) d1;
		
		//암시적 타입 캐스팅(implicit)
		long l2 = i1;
		double d2 = f1;
		double d3 = i1;
		
		//boolean 에 1,0 넣는 것은 안됨. 
		

	}

}
