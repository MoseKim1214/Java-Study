package chapter02;

public class Goods2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods2 g = new Goods2();
		
		
		// public은 접근 제한이 없다.
		g.name = "camera";
		
		// private는 보이지도 않는다.
		//g.countSold = 10;
		
		// protected는 같은 패키지에서 접근 할 수 있다. 
		// 더 중요한 것은 자식에서 접근 가능하게 함.
		g.price = 1000;
		
	}

}
