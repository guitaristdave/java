package seminars.lesson1;
import java.util.Random;
// дан массив чисел, нужно сформировать новую выборку 
// из только четных чисел


public class app {


    public static void main(String[] args) {
        int[] array = CreateArray(10, 56);
        PrintArray(array);
        int[] ans = isEven(array);
        PrintArray(ans);
    }

    public static int[] isEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[index] = arr[i];
                index++;
            }
        }

        return result;
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
    }

    public static int[] CreateArray(int size, int maxValue) {
        int[] result = new int[size];
        for (int i = 0; i < result.length; i++) {
            Random random = new Random();
            result[i] = random.nextInt(maxValue);
        }
        return result;
    }
    
}

