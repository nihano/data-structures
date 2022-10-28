import java.util.Arrays;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] scoreArray = new int[10];

            int arr[] = {2, 4, 6, 8};

            int newArr[] = Arrays.copyOf(arr, arr.length - 1);

            System.out.println("Original  : " + Arrays.toString(arr));
            System.out.println("New Array : " + Arrays.toString(newArr));
        }

    }
