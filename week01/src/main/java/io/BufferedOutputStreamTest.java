package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) {
		BufferedOutputStream bos = null; // 제일 끝에 있는 애만 없애면 다 없어지므로 bos만 앞으로 빼줌.
		try {
			
			// 기반스트림(주스트림)
			FileOutputStream fos = new FileOutputStream("test.txt");
		
			//보조스트림
			bos = new BufferedOutputStream(fos); //주스트림과 연결됨
			for(char c= 'a'; c<='z'; c++) {
				
					bos.write(c);
				
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Can Not Open:" + e);
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
