package com.jspider.FilehandingOperation;
import java.io.File;
import java.io.IOException;
public class File_creation {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\java\\m21\\java.png");
		boolean iscreate=f.createNewFile();
		if(iscreate) {
			System.out.println("file is created");
		}else {
			System.out.println("file is not created");
		}
	}
}
