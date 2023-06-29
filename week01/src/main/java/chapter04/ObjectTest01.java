package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10,20);
		
		//Class c = p.getClass();
		
		
		System.out.println(p.getClass());
		System.out.println(p.hashCode()); // address 기반의 해싱값
		System.out.println(p.toString());
		System.out.println(p);
	}

}
