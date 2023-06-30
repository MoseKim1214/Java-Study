package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileTest {

	public static void main(String[] args) {
		InputStream is = null;
		try {
			is = new FileInputStream("hello.txt");
		
			int data = is.read(); //IO exception 처리를 안하고 있음
			
			System.out.println((char)data);
			
		} catch (FileNotFoundException e) {
			
			System.out.println("error:" + e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error: " + e);
			
		}finally {
			try {
				if(is != null) {
				is.close();} // null.close되면 null point Exception이 발생
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
