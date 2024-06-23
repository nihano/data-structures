public class ExponentialSearch {

    public static int exponentialSearch(int[] arr, int data){
        int bound = 1;
        //Double the bound until arr[bound] is greater than or equal to target
        while (bound<arr.length && arr[bound]<data){
            bound*=2;
        }

        int left = bound/2;
        int right = Math.min(bound, arr.length);

        //perform binary search in the identified range
        while (left<=right){
            int mid = (left+right)/2;
            if (arr[mid]==data){
                return mid;
            }else if (data>arr[mid]){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int target = 17;
        System.out.println(exponentialSearch(arr, target));
    }
}
