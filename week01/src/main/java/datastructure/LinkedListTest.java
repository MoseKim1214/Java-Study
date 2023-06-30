package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
			// ArrayList- vector 코드에서 객체 생성시 LinkedList로만 바꿔주면 된다.
			// 컴포넌트식 개발
			
			List<String> list = new LinkedList<>();
			list.add("둘리");
			list.add("페이커");
			list.add("아디다스");
			
			// 순회1
			for(int i = 0; i< list.size(); i++) {
				String s = list.get(i);
				System.out.println(s);
			}
			
			// 삭제
			list.remove(2);
			
			System.out.println("=========");
			//순회 2
			Iterator<String> it = list.iterator();
			while(it.hasNext()) {
				String s = it.next();
				System.out.println(s);
			}
			System.out.println("=========");
			//순회 3
			for(String s : list	) {   //
				System.out.println(s);
			}
		


	}

}
