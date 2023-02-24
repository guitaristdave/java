package selfed.SearchAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = createArray(100000);
        fillArray(array);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void sort(int[] array) {
        int length = array.length - 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            } 
        }
    }

    public static int[] createArray(int size) {
        int[] result = new int[size];
        return result;
    }

    public static int[] fillArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(50);
        }
        return arr;
    }
}

