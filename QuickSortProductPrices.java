import java.util.Arrays;

public class QuickSortProductPrices {
    // Function to partition the array
    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Choosing the last element as pivot
        int i = low - 1; // Index for smaller elements

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) { // If element is smaller than pivot
                i++;
                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Swap pivot element to its correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1; // Return pivot index
    }

    // Recursive function to apply Quick Sort
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Recursively sort elements before and after partition
            quickSort(prices, low, pivotIndex - 1);
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] productPrices = {1200, 450, 3000, 800, 1500, 500, 2500};

        System.out.println("Before Sorting: " + Arrays.toString(productPrices));

        quickSort(productPrices, 0, productPrices.length - 1);

        System.out.println("After Sorting: " + Arrays.toString(productPrices));
    }
}
