package homeworks.lesson4;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        int[] arr = fillArray(createArray(10));
        System.out.println(printArray(arr));
        heapSort(arr);
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

    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            heapify(array, n, i);
        }

        for (int i = n - 1; i > 0; i--) {
            int tmp = array[0];
            array[0] = array[i];
            array[i] = tmp;
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int tmp = array[i];
            array[i] = array[largest];
            array[largest] = tmp;
            heapify(array, n, largest);
        }
    }

}