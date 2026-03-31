import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // User input for ages and heights
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Amar's height (cm): ");
        int heightAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Akbar's height (cm): ");
        int heightAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Anthony's height (cm): ");
        int heightAnthony = sc.nextInt();

        // Find youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngest = "";
        if (youngestAge == ageAmar) youngest += "Amar ";
        if (youngestAge == ageAkbar) youngest += "Akbar ";
        if (youngestAge == ageAnthony) youngest += "Anthony ";
        System.out.println("Youngest friend : ");

        // Find tallest
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallest = "";
        if (tallestHeight == heightAmar) tallest += "Amar ";
        if (tallestHeight == heightAkbar) tallest += "Akbar ";
        if (tallestHeight == heightAnthony) tallest += "Anthony ";
        System.out.println("Tallest friend : " + tallest);
    }
}
