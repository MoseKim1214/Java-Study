package chapter04;

public class StringTest03 {
	public static void main(String[] args) {
		String s1 = "abCAbcABC";
		
		System.out.println(s1.length());
		
		System.out.println(s1.charAt(2));
		
		System.out.println(s1.indexOf("abc"));
		System.out.println(s1.indexOf("abc", 7)); // 7번쨰 인덱스부터 찾아봐
		System.out.println(s1.substring(3));// 3번쨰부터 끝까지 출력
		System.out.println(s1.substring(3,5));//3~4번째까지 출력
		
		String s2 = "    ab    cd   ";
		String s3 = "efg,hij,klm,nop,qrs";
		
		String s4 = s1.concat(s3);
		System.out.println(s4);
		
		System.out.println(s2.trim());// trim :잔가지를 자른다. 문자열에서는 문자열 앞 뒤 공백을 없앤다.
										// 비밀번호 같은 거 입력받을때 사용. 
		System.out.println(s2.replaceAll(" ", "")); //전부 대체
		
		String[] tokens = s3.split(","); // 문자열 잘라낸걸 token이라 말함. 배열로 리턴
		for(String s : tokens) {
			System.out.println(s);
		}
		
		s3.split(" "); // 분리자가 해당되는 문자가 없을떄는 문자열 하나로 다 넣음.
		
		
	
	}
}
