package CSVHandling;
import java.io.*;
public class ReadAndCountRows {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("CSVFileExample.csv"))){
			String line;
			int count=-1;
			while((line = br.readLine())!= null) {
				count++;
			}
			System.out.println("row count: "+count);
		}catch(IOException e) {
			System.out.println("File not found");
		}

	}

}
