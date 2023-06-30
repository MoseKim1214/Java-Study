package datastructure;

import java.util.List;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		//Stack은 벡터를 상속받아서 만듦. 즉 리스트 연산으로도 쓸수있음
		
		Stack<String> stack = new Stack<>();
		stack.push("Hello");
		stack.push("World");
		stack.push("!!!");
		
		while(!stack.isEmpty()) {
			String s = stack.pop();
			System.out.println(s);
		}
		
		System.out.println("=========");
		
		stack.push("Hello");
		System.out.println(stack.pop());
		
		//비어있는 경우, pop()을 호출하면 예외가 발생한다.
		//stack.pop();
		
		stack.push("뽀삐");
		stack.push("카르마");
		stack.push("사미라");
		
		System.out.println(stack.pop());
		System.out.println(stack.peek()); // top에 있는 걸 보는 것. 빠지진 않음.
		
		System.out.println(stack.size());
	}

}
