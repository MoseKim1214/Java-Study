package chapter03;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void show() {
		System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		
		
	}
	public void show(boolean visible) {
		if(!visible) {
		System.out.println("점[x="+x+", y="+y+"]을 지웠습니다.");
	
		} else {
			show();  // 코드가 중복되면 함수로 써서 수정할 곳을 줄여라.
		}
	}
	
}
