package seminars.lesson4;

public class Program {
    public static void main(String[] args) {
        System.out.println(f(0, 0));
        System.out.println(x);
    }

    static int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
    static int[] b = {20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    static int x = 0;

    public static int f(int i, int j) {
        x++;
        if (i >= a.length || j == b.length) {
            return 0;
        }
        else if (a[i] == b[j]) return 1 + f(i+1, j+1);
        else {
            return Math.max(f(i, j+1), f(i+1, j));
        }
    }
}
