package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite_Read {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("Tops2.txt");
		String s="This is File Writer/Reader Demo.";
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader("Tops2.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}

