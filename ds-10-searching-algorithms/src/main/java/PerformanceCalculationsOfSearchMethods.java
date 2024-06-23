import java.util.Arrays;

public class PerformanceCalculationsOfSearchMethods {
    public static void main(String[] args) {
        int[] numbers = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            numbers[i] = i;
        }
        long[] linearSearchResults = linearSearch(numbers, 333334);
        System.out.println("Linear Search Results:  " + linearSearchResults[0] + " miliseconds and " + linearSearchResults[1] + " comparisons..");
        long[] binarySearchResults = binarySearchIterative(numbers, 333334);
        System.out.println("binary Search Results:  " + binarySearchResults[0] + " miliseconds and " + binarySearchResults[1] + " comparisons..");
        long[] ternarySearchResults = ternarySearchIterative(numbers, 333334);
        System.out.println("Ternary Search Results:  " + ternarySearchResults[0] + " miliseconds and " + ternarySearchResults[1] + " comparisons..");
        long[] jumpSearchResults = jumpSearch(numbers, 33333);
        System.out.println("Jump Search Results:  " + jumpSearchResults[0] + " miliseconds and " + jumpSearchResults[1] + " comparisons..");
    }

    public static long[] linearSearch(int[] arr, int data) {
        long[] result = new long[2];
        long startTime = System.currentTimeMillis();

        int comparisons = 0;
        for (int i = 0; i < arr.length; i++) {
            comparisons++;
            if (arr[i] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }
        }
        return new long[2];
    }

    public static long[] binarySearchIterative(int[] arr, int data) {
        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int middle = (right + left) / 2;
            comparisons++;
            if (arr[middle] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }
            comparisons++;
            if (data < arr[middle]) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        return new long[2];
    }

    public static long[] ternarySearchIterative(int[] arr, int data) {

        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;

        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {

            int partition = (right - left) / 3;
            int middle1 = left + partition;
            int middle2 = right - partition;
            comparisons++;
            if (arr[middle1] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }
            comparisons++;
            if (arr[middle2] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }
            comparisons++;
            if (data < middle1) {
                right = middle1 - 1;
            } else if (data > middle1 && data < middle2) {
                left = middle1 + 1;
                right = middle2 - 1;
            } else {
                left = middle2 + 1;
            }
            comparisons++;
        }

        return new long[2];

    }

    public static long[] jumpSearch(int[] arr, int data) {

        long[] result = new long[2];
        long startTime = System.currentTimeMillis();
        int comparisons = 0;

        int blockSize = (int) Math.sqrt(arr.length);
        int start = 0;
        int next = blockSize;
        while (start < arr.length && arr[next - 1] < data) {
            start = next;
            next += blockSize;
            comparisons++;
            if (next > arr.length) next = arr.length;
        }

        for (int i = start; i < next; i++) {
            comparisons++;
            if (arr[i] == data) {
                result[0] = System.currentTimeMillis() - startTime;
                result[1] = comparisons;
                return result;
            }
        }
        return new long[2];
    }

}
