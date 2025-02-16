import java.util.Arrays;

public class LinearAndBinarySearch {
    // Function to find the first missing positive integer (Linear Search)
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Place each number at its correct position if possible
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                // Swap arr[i] with arr[arr[i] - 1]
                int temp = arr[arr[i] - 1];
                arr[arr[i] - 1] = arr[i];
                arr[i] = temp;
            }
        }

        // Step 2: Find the first missing positive
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1; // If all numbers from 1 to n are present, return n + 1
    }

    // Binary Search function
    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1}; // Unsorted array with missing numbers

        // Find the first missing positive integer
        int missing = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        // Sort the array for Binary Search
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Find the index of a target value using Binary Search
        int target = 4;
        int index = binarySearch(arr, target);
        System.out.println("Index of target " + target + ": " + index);
    }
}
