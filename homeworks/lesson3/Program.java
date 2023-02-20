package homeworks.lesson3;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int[] arr = fillArray(createArray(123));
        System.out.println(printArray(arr));
        mergeSort(arr);
        System.out.println(printArray(arr));
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

    public static String printArray(int[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            result += arr[i] + ", ";
        }
        result += arr[arr.length - 1] + "]";
        return result;
    }

    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }

    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }

    public static void merge(int[] result, int[] left, int[] right) {
        int i1 = 0;
        int i2 = 0;

        for (int i = 0; i < result.length; i++) {
            if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
                result[i] = left[i1];
                i1++;
            } else {
                result[i] = right[i2];
                i2++;
            }
        }
    }
}