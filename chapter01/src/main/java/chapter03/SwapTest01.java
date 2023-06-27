package chapter03;

public class SwapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		swap(a, b);  // 숫자가 바뀌지 않는다. 왜?? 함수 호출 끝나면 스택에서 모두 삭제되므로
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
	}
	
	public static void swap(int p, int q) {
		int temp = p;
		p = q;
		q = temp;
	}
}
