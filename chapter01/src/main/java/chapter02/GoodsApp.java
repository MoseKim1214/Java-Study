package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods();
		System.out.println("상품 갯수: " + Goods.countOfGoods);
		camera.setName("nikon");
		camera.setPrice(40000);
		camera.setCountStock(20);
		camera.setCountSold(40);
		
		
		
		camera.showInfo();
		
		int discountPrice = camera.calcDiscountPrice(0.5);
		System.out.println(discountPrice);
	}

}
