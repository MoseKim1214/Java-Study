package chapter01;

public class Ex26Continue {

	public static void main(String[] args) {
		testFor();
	}
	
	public static void testFor() {
		for(int i=0; i<10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
	}
	
	public static void testWhile() {
		int i =0;
		while (i<10) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
			i++;						// while은 i++가 continue 뒤에 있으면 무한루프 빠진다. 
		}
	}

}
