package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("H:\\abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("The mentioned drive is not available");
		}
		try {
		if(fos !=null)
		fos.write("Hello There!".getBytes());
		}catch(IOException e) {
		System.out.println("Con't Write in the File!");
	}
		
		System.out.println("success!");
		 try {
			 if(fos != null)
		    fos.close();
		 }catch(IOException e){
		System.out.println("Closing File is Issue!");

	}
System.out.println("Code continue....");

	}

}
