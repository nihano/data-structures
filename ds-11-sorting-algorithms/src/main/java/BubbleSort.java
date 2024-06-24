import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                    swap=true;
                }
            }
            if (!swap) return arr; //if (swap==false) return arr;
        }
        return arr;
    }

    public static void swap(int[] arr, int idx1, int idx2){
        int temp=arr[idx1];
        arr[idx1] =arr[idx2];
        arr[idx2]=temp;
    }


}
