package searching;
import java.io.*;

public class ConsoleToFileUsingInputStreamReader {

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            FileWriter fw = new FileWriter("output.txt");
            String input;
            System.out.println("Enter text (type 'exit' to stop):");

            while (true) {
                input = br.readLine();

                if (input.equalsIgnoreCase("exit")) {
                    break;
                }

                fw.write(input + "\n");
            }
            fw.close();

            System.out.println("Input successfully written to file.");

        } catch (IOException e) {
            System.out.println("Error occurred");
        }
    }
}
