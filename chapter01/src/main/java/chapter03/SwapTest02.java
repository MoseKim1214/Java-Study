package chapter03;

public class SwapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intValue a = new intValue(10);
		intValue b = new intValue(20);
		
		
		System.out.println("a:" + a.value);
		System.out.println("b:" + b.value);
		
		swap(a, b);  // 숫자가 바뀌지 않는다. 왜?? 함수 호출 끝나면 스택에서 모두 삭제되므로
		
		System.out.println("a:" + a.value);
		System.out.println("b:" + b.value);
	}
	
	public static void swap(intValue p, intValue q) {
		int temp = p.value;
		p.value = q.value;
		q.value = temp;
	}
}
