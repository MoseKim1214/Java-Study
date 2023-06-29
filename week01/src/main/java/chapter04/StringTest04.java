package chapter04;

public class StringTest04 {
	public static void main(String[] args) {
		String s1 = "Hello" + "World" + "Java" + 17;
		System.out.println(s1); // 객체끼리 어떻게 더하지?라는 질문이 나와야한다.
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" World ").append("Java").append(17).toString();
		System.out.println(sb);// 
		
//		
//		String s2 = "";
//		for(int i =0; i<100000; i++) {
//			 s2 = s2 + i;  // string 연산을 할 경우 오래 걸림.
//			 // s2 = new StringBuffer(s2).append(i).toString(); 
//			 // CPU가 메모리에 많이 접근하면 시간이 오래 걸림. 그래서 시간이 오래 걸리는 거다. 
//			 //String 연산은 루프에서 많이 사용하면 안됨. 
//		}
//		
		StringBuffer sb2 = new StringBuffer("");
		for (int i = 0; i< 100000; i++ ) {
			sb2.append(i); // 메서드 호출은 빠르기 때문에 이걸로 쓰는게 더 좋은 코드
		}
		String s3 = sb2.toString();
		System.out.println(s3.length());
	}
}
