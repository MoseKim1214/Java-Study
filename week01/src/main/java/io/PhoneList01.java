package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
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
		
		BufferedReader br = null;
		try {
		//1. 기반스트림 
		FileInputStream fis = new FileInputStream(file);
		
		//2. 보조스트림1(byte1|byte2|byte3 -> char)
		InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
		
		//3. 보조 스트림2(char1|char2|char3|\n -> "char1char2char3")
		br = new BufferedReader(isr);
		
		String line = null;
		while((line = br.readLine()) != null) {
			
			System.out.println(line);
		}
		
		}catch(UnsupportedEncodingException e) {
			System.out.println("Error" + e);
			
			
		}catch(IOException e) {
			System.out.println("Error" + e);
			
			
		}finally {
			try {
				if(br!=null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
