import java.util.Scanner;
public class TextToWord {
    // Method to find length of string without using length()
    static int getStringLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }
    // Method to split text into words using charAt()
    static String[] splitTextIntoWords(String text) {
        int length = getStringLength(text);
        // Count number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        // Store indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        // Extract words using space indexes
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = (i < wordCount - 1) ? spaceIndexes[i] : length;
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }
        return words;
    }
    // Method to compare two string arrays
    static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complete text: ");
        String input = scanner.nextLine();
        // Split using user-defined method
        String[] userDefinedWords = splitTextIntoWords(input);
        // Split using built-in method
        String[] builtInWords = input.split(" ");
        // Compare both arrays
        boolean result = compareStringArrays(userDefinedWords, builtInWords);
        System.out.println("Words using user-defined method:");
        for (String word : userDefinedWords) {
            System.out.println(word);
        }
        System.out.println("Words using built-in split() method:");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        System.out.println("Are both word arrays equal? " + result);
    }
}