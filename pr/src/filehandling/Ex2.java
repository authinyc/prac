package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				String file = "data/name.txt";
				FileWriter fw = new FileWriter(file,true);
				fw.write("Sabuz");
				fw.close();


	}

}
