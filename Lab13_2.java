package assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab13_2 {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("Lab13.txt");
		String s="This is File Writer/Reader Demo.";
		fw.write(s);
		fw.flush();
		fw.close();
		
		FileReader fr=new FileReader("Lab13.txt");
		int i;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}
}
