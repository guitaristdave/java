package selfed.SearchAlgorithms;

import java.util.Arrays;
import java.util.Random;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = createArray(100000);
        fillArray(array);
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
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

    public static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int value = array[i];
            while ((i > 0) && array[i - 1] > value) {
                array[i] = array[i - 1];
                i = i -1;
            } 
            array[i] = value;
        }
    }
}
