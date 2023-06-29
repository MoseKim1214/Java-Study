package tv;

public class TV {
	private int channel;  // 1-255(로테이션이 돌도록, 255에서 up하면 1로)
	private int volume;   // 0-100, 마찬가지
	private boolean power; // power가 off라면 channel, volume이 작동하지 않도록
	
	private int channelMax = 255;
	private int volumeMax = 255;
	
	public TV(int channel, int volume, boolean power) {
		// TODO Auto-generated constructor stub
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}


	
	public boolean isPower() {
		return power;
	}


	public boolean powerError(boolean isPower) {
		if (!isPower) {
			System.out.println("TV가 꺼져있어서, 조작 할 수 없습니다.");
			return false;
		}
		return true;
	}
	
	public void power(boolean on) {
		if (on) {
			this.power = true;
			return;
		}
		this.power = false;
		
	}
	
	
	// 숫자를 입력해서 볼륨을 입력
	public void volume(int volume) {
		if (powerError(isPower())) {
			this.volume = volume;
		}
		
		
	}
	
	
	// 업 버튼이면 볼륨 하나씩 증가
	public void volume(boolean up) {
		
		if (powerError(isPower())) {
			if (volume == volumeMax) {
				volume = 1;
				return;
			}
			volume += 1;
		}
		
		
	}
	
	public void channel(int channel) {
		
		if (powerError(isPower())) {
			this.channel = channel;
		}
	
	}
	
	public void channel (boolean up) {
		
		if (powerError(isPower())) {
			if (channel == channelMax) {
				channel = 1;
				return;
			}
			channel += 1;
		}
		
	
	}
	
	public void status() {
		System.out.println(
				"TV[power="+(power ? "on" : "off") +
				", channel="+channel+
				", volume="+volume+"]");
	}

}
