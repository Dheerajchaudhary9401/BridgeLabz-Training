package searching;
import java.io.*;
import java.util.*;
public class CountTheOccurrenceOfAWordUsingFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		try {
			FileReader fr = new FileReader("example.txt");
			BufferedReader br = new BufferedReader(fr);
			int count=0;
			String line;
			while((line=br.readLine())!=null) {
				String[] words = line.split("\\s+");
				for(String w:words) {
					if(w.equals(word)) {
						count++;
					}
				}
			}
			br.close();
			System.out.println("Occurrence: "+count);
		}
		catch(IOException e){
			System.out.println("file not found");
		}
		sc.close();
	}

}
