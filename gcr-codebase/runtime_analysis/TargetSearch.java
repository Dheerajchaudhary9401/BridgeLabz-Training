package runtime_analysis;
import java.util.Arrays;
public class TargetSearch {
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] sizes = {1000, 10000, 1000000};
        for (int size : sizes) {
            int[] data = new int[size];
            for (int i = 0; i < size; i++) {
                data[i] = i + 1;
            }
            int target = size; // worst-case element
            // time for linear search
            long startLinear = System.nanoTime();
            linearSearch(data, target);
            long endLinear = System.nanoTime();
            // Sort data for Binary Search
            Arrays.sort(data);
            // time for Binary Search
            long startBinary = System.nanoTime();
            binarySearch(data, target);
            long endBinary = System.nanoTime();
            System.out.println("Dataset Size: " + size);
            System.out.println("Linear Search Time: " + (endLinear - startLinear) + " ns");
            System.out.println("Binary Search Time: " + (endBinary - startBinary)  + " ns");
            System.out.println();
        }
    }
}
