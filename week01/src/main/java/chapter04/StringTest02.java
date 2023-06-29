package chapter04;

public class StringTest02 {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "def";
		String s3 = s2;
		
		
		// String이 불변 객체이다. 여기서 uppercase한건 새로운 객체를 만들어서 리턴한거다. 
		System.out.println(s1.toUpperCase());
		System.out.println(s1);  // s1은 변하지 않았다. 
		
		String s4 = s2.concat("??");
		String s5 = "!".concat(s2).concat("@"); // 문자열 바로 앞에 와도 구조적으로 같은거다.
		System.out.println(s5);
		System.out.println(s2);
		
		
		String s6 = "Hello";
		System.out.println(equalsHello(s6));
		
		
		
		
	}
	
	public static boolean equalsHello(String s) {
		//return s.equals("Hello");  s가 null인 경우 에러
		
		return "Hello".equals(s); // 안전한 코드	
		}
}
