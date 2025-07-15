package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputDemo {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("Tops.txt");
		String s="This is file input/output";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File Written succesfully");
	
		FileInputStream fis=new FileInputStream("Tops.txt");
		int i;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}
	
}
