/*Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
Hint => 
Take input for a number of persons
Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
       double[][] personData = new double[number][3];
       String[] weightStatus = new String[number];
Take input for weight and height of the persons and for negative values, ask the user to enter positive values
Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
Display the height, weight, BMI and status of each person
 */
import java.util.Scanner;
public class BMITwoDArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int numberOfPersons = scanner.nextInt();

        double[][] personData = new double[numberOfPersons][3]; // [weight, height, BMI]
        String[] weightStatus = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {
            double weight, height;
            // Input weight
            do {
                System.out.println("Enter weight (in pounds) for person " + (i + 1) + ":");
                weight = scanner.nextDouble();
                if (weight <= 0) {
                    System.out.println("Please enter a positive value for weight.");
                }
            } while (weight <= 0);

            // Input height
            do {
                System.out.println("Enter height (in inches) for person " + (i + 1) + ":");
                height = scanner.nextDouble();
                if (height <= 0) {
                    System.out.println("Please enter a positive value for height.");
                }
            } while (height <= 0);

            // Calculate BMI
            double bmi = (weight * 703) / (height * height);
            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Display results
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Weight Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", 
                              personData[i][0], 
                              personData[i][1], 
                              personData[i][2], 
                              weightStatus[i]);
        }
    }
}