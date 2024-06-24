public class InsertionSort {
    public static int[] insertionSort(int[] arr){
        //i'll start to compare second element with first that's why i start with i=1
        for (int i = 1; i < arr.length; i++) {
            int toBeInserted = arr[i];
            int j = i-1;//this is predecessor
            //start shifting operation here
            while (j>=0 && toBeInserted<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=toBeInserted;
        }
        return arr;
    }
}
