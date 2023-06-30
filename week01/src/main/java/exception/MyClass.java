package exception;



public class MyClass {

	public void danger() throws MyException{  //어떤 예외사항이 발생할 수 있다고 명시해줘야함
		System.out.println("some code 1");
		
		if(1-1 == 0) {
			throw new MyException();  
		}
		System.out.println("some code 2");
		
		
	}

}
