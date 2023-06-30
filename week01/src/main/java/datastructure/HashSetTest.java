package datastructure;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		
		String s1 = new String("둘리");
		
		
		s.add("홍길동");
		s.add("마이콜");
		s.add("뉴발란스");
		
		System.out.println(s.size());
		System.out.println(s.contains("홍길동"));
		System.out.println(s.contains(s1)); //false. 값을 기반으로 비교한다.
		
		//순회
		for(String str:s) {
			System.out.println(str);
		}
	}

}
