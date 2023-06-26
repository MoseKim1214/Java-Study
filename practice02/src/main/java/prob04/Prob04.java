package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] result1 = str.toCharArray();
		char[] result2 = new char[result1.length];
		for (int i=0; i<result1.length; i++) {
			result2[i] = result1[result1.length-i-1];
		}
		
		return result2;
	}

	public static void printCharArray(char[] array){
		/* 코드를 완성합니다 */
		
		System.out.println( array );
	}
}