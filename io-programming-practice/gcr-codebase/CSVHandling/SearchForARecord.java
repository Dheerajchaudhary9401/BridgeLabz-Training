package CSVHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchForARecord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String s = sc.nextLine();
		try(BufferedReader br = new BufferedReader(new FileReader("CSVFileExample.csv"))){
			String line;
			int count=0;
			int c =0;
			String header=null;
			while((line = br.readLine())!=null) {
				if(c==0) {
					header =line;
				}
				String[] words = line.split(",");
				if(s.equalsIgnoreCase(words[1])) {
					System.out.println(header);
					System.out.println(line);
					count++;
				}
				c++;
			}
			if(count==0) System.out.println("Name not found");
			
		}catch(IOException e) {
			System.out.println("file not found");
		}
		sc.close();

	}

}
