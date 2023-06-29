package chapter01;

public class Ex29Array {

	public static void main(String[] args) {
		int[] scores = new int[] {90,100,120,30,100,20,40};
		int sum = 0;
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println(sum);
		
		
	}

}
