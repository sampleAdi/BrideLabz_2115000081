import java.util.Arrays;

public class SelectionSortExamScores {
    public static void selectionSort(int[] scores) {
        int n = scores.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first element is the minimum

            // Find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] examScores = {78, 92, 45, 88, 67, 99, 56, 82};

        System.out.println("Before Sorting: " + Arrays.toString(examScores));

        selectionSort(examScores);

        System.out.println("After Sorting: " + Arrays.toString(examScores));
    }
}
