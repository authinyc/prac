package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Ex {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		String file = "data/name.txt";
		FileWriter fw = new FileWriter(file);
		fw.write("Arafat/n");
		fw.close();

	}

}
