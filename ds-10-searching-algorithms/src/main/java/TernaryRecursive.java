public class TernaryRecursive {
    public static int ternaryRecursive(int[] arr, int data, int left, int right){

        if (left>right) return -1;

        int partition = (right-left)/3;
        int middle1 = left+partition;
        int middle2 = right-partition;

        if (arr[middle1]==data) return middle1;
        if (arr[middle2]==data) return middle2;

        if (data<arr[middle1]){
            return ternaryRecursive(arr, data, left, middle1-1);
        } else if (data>arr[middle2]) {
            return ternaryRecursive(arr,data,middle2+1, right);
        }else{
            return ternaryRecursive(arr, data, middle1+1, middle2-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,10,18,21,30};
        System.out.println(ternaryRecursive(arr, 30,0, arr.length-1));
    }
}
