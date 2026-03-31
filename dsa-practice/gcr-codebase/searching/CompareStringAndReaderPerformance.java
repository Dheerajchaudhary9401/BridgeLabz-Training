package searching;
import java.io.*;

public class CompareStringAndReaderPerformance {
    private static final int ITERATIONS = 1000000;
    public static void main(String[] args) {
        compareStringBuilderAndStringBuffer();
        compareFileReaderAndInputStreamReader();
    }
     private static void compareStringBuilderAndStringBuffer() {
        String text = "hello";
        // StringBuilder
        long startSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append(text);
        }
        long endSB = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (endSB - startSB) + " ms");
        // StringBuffer
        long startSBuf = System.currentTimeMillis();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbuf.append(text);
        }
        long endSBuf = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (endSBuf - startSBuf) + " ms");
    }
    private static void compareFileReaderAndInputStreamReader() {

        String filePath = "example.txt";

        // FileReader
        long startFR = System.currentTimeMillis();
        int countFR = countWordsUsingFileReader(filePath);
        long endFR = System.currentTimeMillis();

        System.out.println("FileReader word count: " + countFR);
        System.out.println("FileReader time: " + (endFR - startFR) + " ms");

        // InputStreamReader
        long startISR = System.currentTimeMillis();
        int countISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.currentTimeMillis();

        System.out.println("InputStreamReader word count: " + countISR);
        System.out.println("InputStreamReader time: " + (endISR - startISR) + " ms");
    }
    private static int countWordsUsingFileReader(String filePath) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file using FileReader");
        }
        return count;
    }
    private static int countWordsUsingInputStreamReader(String filePath) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("Error reading file using InputStreamReader");
        }
        return count;
    }
}

