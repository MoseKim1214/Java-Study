package chapter02;

public class Goods {
	private String name;
	private int price;
	private int countStock;
	private int countSold;

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
}
