package datastructure;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest02 {

	public static void main(String[] args) {
		// collection Framwork가 생긴 이후의 vector 메서드 활용
		
		List<String> list = new Vector<>();
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
