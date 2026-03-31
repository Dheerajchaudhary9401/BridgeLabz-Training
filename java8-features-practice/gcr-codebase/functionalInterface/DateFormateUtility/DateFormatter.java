package functionalInterface.DateFormateUtility;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public interface DateFormatter {
	static String formatDate(LocalDate d, String pattern) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern(pattern);
		return d.format(f);
	}
}
