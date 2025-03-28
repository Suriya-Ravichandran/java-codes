package com.jspider.FilehandingOperation;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Insert_data {

	public static void main(String[] args) throws IOException {
		File f = new File("D:\\java\\m21\\java.txt");
		FileWriter Writer =new FileWriter(f);
		Writer.write('A');
		Writer.write(" Welcome to java file handling program");
	}

}
