import java.util.Arrays;

public class CountingSortStudentAges {
    public static void countingSort(int[] ages, int minAge, int maxAge) {
        int range = maxAge - minAge + 1;
        int[] count = new int[range]; // Frequency array
        int[] output = new int[ages.length]; // Sorted output array

        // Count occurrences of each age
        for (int age : ages) {
            count[age - minAge]++;
        }

        // Compute cumulative frequency
        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        // Build the sorted array
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - minAge] - 1] = ages[i];
            count[ages[i] - minAge]--;
        }

        // Copy sorted data back to original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] studentAges = {12, 15, 10, 18, 17, 12, 14, 16, 11, 10, 13, 15, 17, 12};
        int minAge = 10, maxAge = 18;

        System.out.println("Before Sorting: " + Arrays.toString(studentAges));

        countingSort(studentAges, minAge, maxAge);

        System.out.println("After Sorting: " + Arrays.toString(studentAges));
    }
}
