package CSVHandling;

import java.io.*;

public class WriteInCSVFile {

	public static void main(String[] args) {
		try(BufferedWriter writer = new BufferedWriter(new FileWriter("CSVExample.csv"))){
			writer.write("ID,Name,Department,Salary\n");
			writer.write("01,Dheeraj,cdse,255055\n");
			writer.write("02,vikash,cdse,96312\n");
			writer.write("03,shubham,cdbs,96314\n");
			writer.write("04,nikhil,cdse,96312\n");
			writer.write("05,shaurya,cdbs,96314\n");
			System.out.println("written succussfully");
		}catch(IOException e) {
			System.out.println("file not found");
		}

	}

}
