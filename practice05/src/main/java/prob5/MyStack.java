package prob5;

public class MyStack {
	
	private String[] array;
	private int top;
	
	public MyStack(int size) {
		array = new String[size];
		top = -1;
	}
	
	public void push(String s) {
		if(top < array.length) {
			array[++top] = s;
			
			return;
		}
		System.out.println("OVERFLOW");
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		return false;
	}
	
	
	public String pop() throws MyStackException {
		if(top > -1) {
		
			return array[top--];   
		}
		throw new MyStackException();
	}
}