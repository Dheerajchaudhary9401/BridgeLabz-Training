import java.util.Scanner;
class TextToWordTwoDArray {
    public static int getStringLength(String text) {
        int length = 0;
        for (char ch : text.toCharArray()) {
            length++;
        }
        return length;
    }
    public static String[] splitTextIntoWords(String text) {
        int length = getStringLength(text);
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
    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter complete text: ");
        String input = scanner.nextLine();
        String[] words = splitTextIntoWords(input);
        String[][] wordsWithLengths = getWordsWithLengths(words);
        System.out.printf("%-15s %-10s%n", "Word", "Length");
        for (String[] pair : wordsWithLengths) {
            System.out.printf("%-15s %-10d%n", pair[0], Integer.parseInt(pair[1]));
        }
    }
}