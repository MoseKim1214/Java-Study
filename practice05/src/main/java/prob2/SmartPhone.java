package prob2;

public class SmartPhone extends MusicPhone {
	
	@Override
	public void execute(String function) {
		
		if(function.equals("앱")) {
			executeApp();
			return;
		}
		super.execute(function);
		
	}
	
	private void executeApp() {
		System.out.println("앱실행");
	}
}
