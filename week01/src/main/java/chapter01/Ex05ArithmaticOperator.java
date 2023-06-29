package chapter01;

public class Ex05ArithmaticOperator {

	public static void main(String[] args) {
		int a = 3;
		int b = 8;
		
		// binary operator (이항연산자)
		System.out.println(a + b);
		System.out.println(a - b); // -5
		System.out.println(a * b); // 24
		System.out.println(a / b); // 0 (정수끼리의 연산의 결과는 정수)
		System.out.println(a % b); // 5
		
		//unary operator (단향연산자)
		System.out.println(-a); // -3
		System.out.println(++a); // 4
		System.out.println(a++); // 4, 이후에 a=5

	}

}
