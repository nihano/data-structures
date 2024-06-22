public class JumpSearch {

    public static int jumpSearch(int[] arr, int data) {
        int blockSize = (int) Math.sqrt(arr.length);
        int start = 0;
        int next = blockSize;
        while (start < arr.length && arr[next - 1] < data) {
            start = next;
            next += blockSize;
            if (next > arr.length) next = arr.length;
        }

        for (int i = start; i < next; i++) {
            if (arr[i]==data) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 18, 21, 30};
        System.out.println(jumpSearch(arr, 10));
    }
}
