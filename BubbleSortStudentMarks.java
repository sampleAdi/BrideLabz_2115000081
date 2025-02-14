import java.util.Arrays;

public class BubbleSortStudentMarks {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Traverse the array and compare adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Swap if the current element is greater than the next
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps occurred, the array is already sorted
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] studentMarks = {78, 92, 45, 88, 67, 99, 56, 82};

        System.out.println("Before Sorting: " + Arrays.toString(studentMarks));

        bubbleSort(studentMarks);

        System.out.println("After Sorting: " + Arrays.toString(studentMarks));
    }
}
