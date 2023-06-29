package chapter04;

public class ObjectTest03 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("hello");
		String s2 = new String("hello");
		
		System.out.println(s1 == s1);
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		
		
	}
}
