package searching;
import java.io.*;
public class ByteStreamToCharacterStreamConversion {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("example.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		}
		catch(UnsupportedEncodingException e) {
			System.out.println("encoding exception occurred");
		}
		catch(IOException e) {
			System.out.println("cannot read file");
		}
		
	}
}
