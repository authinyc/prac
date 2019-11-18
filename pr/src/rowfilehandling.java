import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class rowfilehandling {

	


	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		String file_r="data/pic1.jpg";
		FileInputStream fis = new FileInputStream (file_r);
		
		String file_w = "data/pic2.jpg";
		FileOutputStream fos = new FileOutputStream (file_w);
		int l = fis.read();
		while(l!=-1) {
			byte b = (byte)l;
			fos.write(b);
			l = fis.read();
		}
		fis.close();
		fos.close();
		
		
		

	}

}
