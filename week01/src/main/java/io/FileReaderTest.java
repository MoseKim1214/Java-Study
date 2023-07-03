package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		int cnt = 0;  //FileInputStream으로 읽으면 바이트단위로 읽으므로 21번 읽음
					//FileReader로 읽으면 7번 읽음
		try {
			in = new FileReader("1234.txt"); //인코딩 방식 안주면 기본적으로 utf 8
			
			int data = -1;
			while((data = in.read()) != -1) {
				System.out.print((char)data);
				cnt++;
			}
			
			
			System.out.print("\n");
			System.out.println(cnt);
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found:" + e);
		} catch (IOException e) {
			
			System.out.println("Error:" + e);
		} finally {
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
