package exception;

import java.io.FileNotFoundException;//import
import java.io.FileOutputStream;//ctrlspace 
import java.io.IOException;//import

	
public class ExceptionDemo4 {
public static void main(String[] args) throws IOException {//import
		FileOutputStream fos = new FileOutputStream("abc.txt");
		fos.write("Hello There!".getBytes());
		System.out.println("Success!");
		fos.close();
		
	}

}
