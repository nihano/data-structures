public class TernarySearchIterative {

    public static int ternarySearchIterative(int[] arr, int data) {
        int left = 0;
        int right = arr.length - 1;

        while (right >= left) {
            int partition = (right - left) / 3;
            int middle1 = left + partition;
            int middle2 = right - partition;

            if (arr[middle1] == data) return middle1;
            if (arr[middle2] == data) return middle2;
            if (data < middle1) {
                right = middle1 - 1;
            } else if (data > middle1 && data < middle2) {
                left = middle1 + 1;
                right = middle2 - 1;
            } else {
                left = middle2 + 1;
            }
        }

        return -1;

    }


}
