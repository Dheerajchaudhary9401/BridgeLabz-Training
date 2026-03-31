package CSVHandling;
import java.io.*;
public class FilterRecords {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("CSVFileExample.csv"))){
			String line;
			System.out.println(br.readLine());
			while((line=br.readLine())!=null) {
				String[] words = line.split(",");
				if(Integer.valueOf(words[3])>80) {
					System.out.println(line);
				}
			}
		}catch(IOException e) {
			System.out.println("File not found");
		}

	}

}
