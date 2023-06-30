package datastructure;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		// collection framework 이전에 쓰던 vector, 쓰면 안됨.
		
		// <>에는 객체가 들어간다. 기본타입이 들어가지 않는다. 정수 넣으려면 Integer
		Vector<String> v = new Vector<>();
		
		v.addElement("홍길동");
		v.addElement("자바의 신");
		v.addElement("나이키");
		
		//순회 1
		for(int i=0; i< v.size(); i++) {
			String s = 	v.elementAt(i);
			System.out.println(s);
		}
		
				
		// 삭제
		v.removeElementAt(2);
		
		System.out.println("======");
		
		//순회 2
		Enumeration<String> e = v.elements();
		while(e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		
		
	}

}
