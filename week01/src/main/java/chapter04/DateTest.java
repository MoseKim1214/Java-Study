package chapter04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now = new Date();
		
		printDate01(now);
		printDate02(now);
		
		
		Calendar cal = Calendar.getInstance(); // 밀레니엄버그 때문에 나옴
		printDate03(cal);
		
		cal.set(Calendar.YEAR,2022); // 연도를 바꿔봄
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 25);
		printDate03(cal);
	}
	
	
	private static void printDate03(Calendar cal) {
		final String[] DAYS = {"일","월", "화", "수", "목", "금", "토"};
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH); //0~11, +1해줘야함
		int date = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		int day = cal.get(Calendar.DAY_OF_WEEK); //요일 1(일요일)~7(토요일)까지 나옴. 
		System.out.println(
				year + "-" +
				(month+1) + "-" +
				date + " " + 
				hour + ":" +
				minute + ":" +
				second + " "
				+ DAYS[day-1] + "요일");
		
	}


	public static void printDate01(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");	
		String date = sdf.format(d); //sdf의 포맷으로 바꿔줌?
		System.out.println(date);
	}
	
	public static void printDate02(Date d) {
		// 연도 (+1900 해줘야함)
		int year = d.getYear();
		
		// 월 (0~11) +1
		int month = d.getMonth();
		
		// 일
		int date = d.getDate();
		
		//시
		int hour = d.getHours();
		
		
		System.out.println(year+1900);
		
		
		
	}
	
}
