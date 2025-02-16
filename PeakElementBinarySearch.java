public class PeakElementBinarySearch {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is greater than its next element, peak is in the left half (or mid itself)
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } 
            // Else, peak is in the right half
            else {
                left = mid + 1;
            }
        }
        return left; // 'left' is now the index of a peak element
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0}; // Example array

        int peakIndex = findPeakElement(arr);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element: " + arr[peakIndex]);
    }
}
