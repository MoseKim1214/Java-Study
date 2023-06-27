package chapter02;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

	public static int countOfGoods = 0;
	
	public Goods() {
		Goods.countOfGoods = Goods.countOfGoods + 1; // 클래스 변수는 클래스 이름으로 접근

	}
	//메서드를 안만들면 readonly 변수가 된다.
	
	//getter는 변수를 접근할 수 있게 하는 메서드
	public String getName() {
		return name;
	}
	
	//setter은 변수를 수정할 수 있게 하는 메서드
	public void setName(String name) {
		//name = name;  파라미터가 우선이다.
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountSold() {
		return countSold;
	}

	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}

	public void showInfo() {
		// TODO Auto-generated method stub
		System.out.println("이름:" + name);
		System.out.println("가격:" + price);
		System.out.println("재고:" + countStock);
		System.out.println("판매량:" + countSold);
	}

	public int calcDiscountPrice(double discountRate) {
		// TODO Auto-generated method stub
		return (int) (price *discountRate);
		
	}
}
