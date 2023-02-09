package homeworks.lesson1;
import java.util.Scanner;


public class program {

    public static void main(String[] args) {
        int idx_num = getInt("Введите порядковый номер треугольного числа:");
        int triangular = TriangularNumber(idx_num);
        System.out.printf("%d-й элемент последовательности: %d", idx_num, triangular);
    }

    static int TriangularNumber(int n) {
        if (n == 1) {
            return 1;
        } else {
            return TriangularNumber(n - 1) + n;
        }
    }

    static int getInt(String text) {
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        int num = in.nextInt();
        in.close();
        return num;
    }
}