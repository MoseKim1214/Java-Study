package io;

import java.io.File;
import java.util.Scanner;


public class PhoneList02 {

	public static void main(String[] args) {
		
		Scanner scanner = null;	
		File file = new File("phone.txt");
		try {
		 scanner = new Scanner(file);
		
		while(scanner.hasNextLine()) {
			String name = scanner.next();
			String phone1 = scanner.next();
			String phone2 = scanner.next();
			System.out.println(name + ":" + phone1 + "-"+ phone2);
		}
		}catch(Exception e) {
			System.out.println("Error" + e);
			
			
		}finally {
			scanner.close();
		}
		
		
	}
}
