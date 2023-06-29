package prob05;

public class MyBase extends Base {

	
	
	@Override
	public void service(String state) {
		
		
		if (state.equals("낮")) {
			day();
		}else if (state.equals("밤")) {
			night();
		
		}else if (state.equals("오후")) {
			afternoon();
		}
	}

	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
		
	}

	@Override
	public void day() {
		
		System.out.println("낮에는 열심히 일하자!");
	}

	
	//다른 파일 건들지 말고 이것만 수정해서 결과 나오도록
	
	
}
