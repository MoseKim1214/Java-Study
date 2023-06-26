package chapter01;

public class Ex30Arrary {

	public static void main(String[] args) {
		
		//선언 시 크기를 지정할 수 없다.
		//int[10] a;
		
		int a1[] = new int[10];
		int[] a2 = new int[10];// 추천, 변수를 선언할 때 일관성을 지키기 위해. 앞에게 타입, 뒤에게 이름
		System.out.println(a1.length);
		System.out.println(a2.length);
		
		
		//초기화1
		int[] a3 = {0,1,2,3,4};  // 내부적으로 new 사용. 하지만 일관성 면에서 별로
		System.out.println(a3.length);
		
		//초기화2
		int[] a4 = new int[5];
		a4[0] = 0;
		a4[1] = 1;
		a4[2] = 2;
		a4[3] = 3;
		a4[4] = 4;
		
		//초기화3 추천. 객체임을 드러나게 하므로
		int[] a5 = new int[] {0,1,2,3,4};
		
		// 사용 1 : 랜덤 접근	
		System.out.println(a5[3]);
		
		// 사용 2 : 순회 접근
		for(int i=0; i< a5.length ; i++) {
			System.out.println(a5[i]);
		}
		
		
	}

}
