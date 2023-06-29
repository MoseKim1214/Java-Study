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
		
		
		Calendar cal = Calendar.getInstance();
		
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
