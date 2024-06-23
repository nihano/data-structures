public class BinarySearchRecursive {

    static int binarySearchRecursive(int[] arr, int target, int left, int right){
        if (left>right) return -1;
        int middle = (left+right)/2;
        if (arr[middle]==target){
            return middle;
        }else if (target<arr[middle]){
            return binarySearchRecursive(arr, target, left, middle-1);
        }else {
            return binarySearchRecursive(arr, target, left+1, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,7,10,11,34,56};
        System.out.println(binarySearchRecursive(arr, 56, 0, arr.length - 1));
    }
}
