package functionalInterface.DateFormateUtility;

import java.time.LocalDate;

public class DateFormat {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println(DateFormatter.formatDate(date, "dd/MM/yyyy"));
		System.out.println(DateFormatter.formatDate(date, "MM/dd/yyyy"));
		System.out.println(DateFormatter.formatDate(date, "yyyy/MM/dd"));
		System.out.println(DateFormatter.formatDate(date, "dd MMM yyyy"));

	}

}
