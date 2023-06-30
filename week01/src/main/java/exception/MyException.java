package exception;

public class MyException extends Exception{
	
	public MyException() {
		super("MyException Occurs");
		
	}
	public void msg(){
		System.out.println("msg");
	}

}
