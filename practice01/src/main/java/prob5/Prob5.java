package prob5;

public class Prob5 {

	public static void main(String[] args) {
		
		for(int i=1; i< 100; i++) {
			int cnt = 0;
			int flag = 0;
			String number = String.valueOf(i);
			for (int k=0; k< number.length(); k++) {
				
				
				if (number.charAt(k) == '3' || number.charAt(k) == '6' || number.charAt(k)=='9') {
					cnt += 1;
					flag = 1;
				}
				
			}
			if (flag ==1) {
				System.out.print(number+" ");
				for(int j=0; j<cnt ; j++) {
					System.out.print("짝");
				}
				System.out.println("\n");
				cnt = 0;
				flag = 0;
			}
			
		}
	}
}
