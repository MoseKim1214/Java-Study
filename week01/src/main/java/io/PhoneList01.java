package io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PhoneList01 {

	public static void main(String[] args) {
		
		File file = new File("phone.txt");
		
		if(!file.exists()) {
			System.out.println("File Not Found");
			return;
		}
		
		
		System.out.println("=====파일 정보");
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.length()+ "bytes");
		
		Date d = new Date(file.lastModified());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		System.out.println(file.lastModified()); //그리니치 천문대 기준 시간
		System.out.println(sdf.format(d));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(d));
		System.out.println("=======전화번호");
		
		
		
	}

}
