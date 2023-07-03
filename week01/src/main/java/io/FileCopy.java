package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		
		try {
			 is = new FileInputStream("Ocean.jpg");
			 os = new FileOutputStream("Ocean.copy.jpg");  // 나머지 인풋들도 여기만 다를 것
			 
			 
			 int data = -1;
			 while((data = is.read()) != -1) {
				 os.write(data);  //한바이트씩 써줌
				 
			 }
			 
		} catch (FileNotFoundException e) {
			
			System.out.println("File Not Found:" + e);
		} catch (IOException e) {
			
			System.out.println("Error:" + e);
		}  finally {
			//자원 정리 매우 중요 (습관이다)
			try {
				if(is !=null) {
					is.close();
				}
				if (os!= null) {
					os.close();  // 같이 close, 어차피 같은 예외처리니까.
				}			// 예외 처리 할 때, 복잡한게 제일 안 좋음.
							//위험한것. os가 에러나서 null인 상태에서 close됬을때.
				
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
		}

	}

}
