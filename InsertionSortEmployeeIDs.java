import java.util.Arrays;

public class InsertionSortEmployeeIDs {
    public static void insertionSort(int[] empIds) {
        int n = empIds.length;

        for (int i = 1; i < n; i++) {
            int key = empIds[i]; // Pick the element to insert
            int j = i - 1;

            // Shift elements of the sorted part to make space for key
            while (j >= 0 && empIds[j] > key) {
                empIds[j + 1] = empIds[j];
                j--;
            }

            // Insert the key in its correct position
            empIds[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIds = {105, 23, 89, 45, 12, 67, 34, 99};

        System.out.println("Before Sorting: " + Arrays.toString(employeeIds));

        insertionSort(employeeIds);

        System.out.println("After Sorting: " + Arrays.toString(employeeIds));
    }
}
