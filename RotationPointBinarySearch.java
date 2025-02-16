public class RotationPointBinarySearch {
    public static int findRotationPoint(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the last element, rotation point is in the right half
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } 
            // Else, rotation point is in the left half
            else {
                right = mid;
            }
        }
        return left; // 'left' is now the index of the smallest element (rotation point)
    }

    public static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12}; // Example rotated sorted array

        int rotationIndex = findRotationPoint(arr);
        System.out.println("Rotation point index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }
}
