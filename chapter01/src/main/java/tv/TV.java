package tv;

public class TV {
	private int channel;  // 1-255(로테이션이 돌도록, 255에서 up하면 1로)
	private int volume;   // 0-100, 마찬가지
	private boolean power; // power가 off라면 channel, volume이 작동하지 않도록
	
	public TV(int i, int j, boolean b) {
		// TODO Auto-generated constructor stub
	}


	public void power(boolean on) {
		
	}
	
	
	// 숫자를 입력해서 볼륨을 입력
	public void volume(int volume) {
		
	}
	
	
	// 업 버튼이면 볼륨 하나씩 증가
	public void volume(boolean up) {
		
	}
	
	public void channel(int channel) {
		
	}
	
	public void channel (boolean up) {
		
	}
	
	public void status() {
		System.out.println(
				"TV[power="+(power ? "on" : "off") +
				", channel="+channel+
				", volume="+volume+"]");
	}

}
