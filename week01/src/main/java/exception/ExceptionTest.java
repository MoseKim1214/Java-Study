package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10 -a;
		
		System.out.println("some code 1");
		try {
			System.out.println("some code 2");
			
			int result = (1+2+3) / b ;
			
			System.out.println("some code 3");
		
		} catch(ArithmeticException ex) {
		
			// 예외 처리
			
			//1. 사과
			System.out.println("미안합니다.");
			
			//2. 로깅
			System.out.println("error:"+ ex);
			
			//3. 종료
			return;
		}finally {
			//에러가 나던 안나던 실행이 됨. 
			//자원 정리
			
			System.out.println("자원정리");
			
		}
		//try catch 밖에 코드 넣는 것은 안 좋다. 에러나도 실행되므로.
		//System.out.println("some code 5");

	}

}
