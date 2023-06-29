package chapter01;

/**
 * 리터럴(literal) 이란 프로그램 코드에 직접적으로 표현되는 값
 */
public class Ex02Literal {

	public static void main(String[] args) {
		double d = 3.14;
		float f = 3.14f; // float을 쓸 떄는 double과 헷갈리지 말고 float이라고 알려주기 위해 f 붙여줌
		System.out.println(f);
		System.out.println(d);
		
		
		short s = 3;
		int i = 1;
		long l = 12345689101L;  // long 값이라고 L 붙여줌.
		
		System.out.println(i);
		System.out.println(l);
		
		char c = 'A';
		byte b = 65;
		
		boolean bool = false;  // true라고 1이라고 하면 자바에서는 안됨.
		
		System.out.println(c);
		System.out.println(bool);

	}

}
