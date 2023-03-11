package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;

public class KeyboardToFile {
	public static void main(String[] args) throws IOException;
		System.out.println("entered main");
		String data = null;
		InputStreamReader isr = new InputStreamReader(System.in);// keyboard is connected to InputStreamReader
		BufferedReader reader = new BufferedReader(isr);//InputStreamReader is connected to BufferedReader
		FileWriter writer= new FileWriter ("NammadeFile.txt");
		System.out.println("enter some text");
		data = reader.readLine();
		while (!data.equals("quit")) {
			//System.out.println("you have entered...." + data);
			writer.write(data);
			data = reader.readLine();//main will be blocked until we enter some text, it will take one line as input
		}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main exited");
	}
}
