package set4;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DynamicTemplateProcessor {
    public static String repeatstr(String s,int n){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(s);
        }
        return sb.toString();
    }
	
	public static String validDate(String s) {
		try {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate d = LocalDate.parse(s,dtf);
		DateTimeFormatter out = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		return d.format(out);
		}
		catch(Exception e){
			return "INVALID";
		}
	}
	
	public static void operation(String s) {
		String[] arr = s.split("\\$");
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<arr.length;i++) {
		   

			if(!arr[i].contains("{")) {
				sb.append(arr[i]);
			}
			else{
				StringBuilder subSb = new StringBuilder(arr[i]);
				int lastidx = arr[i].indexOf('}');
				String sub = arr[i].substring(1,lastidx);
				String[] op = sub.split(":");
				if(op[0].equals("UPPER")) {
					subSb.replace(0, lastidx+1, op[1].toUpperCase());
				}
				else if(op[0].equals("LOWER")) {
					subSb.replace(0, lastidx+1, op[1].toLowerCase());
				}else if(op[0].equals("DATE")) {
					subSb.replace(0, lastidx+1, validDate(op[1]));
				}else if(op[0].equals("REPEAT")){
				    String[] subop = op[1].split(",");
				    subSb.replace(0,lastidx+1,repeatstr(subop[0],Integer.parseInt(subop[1])));
				    
				}
				sb.append(subSb);
			}
		}
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String s = sc.nextLine();
			operation(s);
		}
	}
}
