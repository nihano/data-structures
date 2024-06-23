public class BinarySearchIterative {

    static int binarySearchIterative(int[] arr, int data){
        int left = 0;
        int right = arr.length-1;

        while (left<=right){
            int middle = (right+left)/2;
            if (arr[middle]==data){
                return middle;
            }else if (data<arr[middle]){
                right=middle-1;
            }else{
                left=middle+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,10,18,21};
        System.out.println(binarySearchIterative(arr, 21));
    }


}
