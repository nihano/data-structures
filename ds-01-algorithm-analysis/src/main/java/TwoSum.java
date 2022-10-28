import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = new int[]{2, 11, 7, 15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] arr, int target) {

        int[] newArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] != arr[j] && arr[i] + arr[j] == target) {
                     newArr[0]=i;
                     newArr[1]=j;
                }
            }
        }
        return newArr;
    }
}

