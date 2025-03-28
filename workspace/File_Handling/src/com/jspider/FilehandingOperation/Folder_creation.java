package com.jspider.FilehandingOperation;
import java.io.File;
public class Folder_creation {
	public static void main(String[] args) {
		File f = new File("D:\\java/m21");
		boolean iscreate = f.mkdir();
		if(iscreate) {
			System.out.println("Folder created");
		}else {
			System.out.println("Folder is not created");
		}
	}
}
