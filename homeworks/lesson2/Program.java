package homeworks.lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Program {
    public static void main(String[] args) {
        txtRead();
        setVar();
        double answer = fastPow();
        txtWrite(answer);
    }

    public static int value;
    public static int exp;
    private static String inputPath = "homeworks/lesson2/input.txt";
    private static String outputPath = "homeworks/lesson2/output.txt";
    private static Map<String, String> dictionary = new HashMap<String, String>();

    public static double fastPow() { //возводит value в степень exp
        double result = 1;
        if (exp >= 0) {
            while (exp > 0) {
                if (exp % 2 == 1) {
                    result *= value;
                }
                value *= value;
                exp /= 2;
            }
            return result;
        } else {
            exp = -exp;
            while (exp > 0) {
                if (exp % 2 == 1) {
                    result *= value;
                }
                value *= value;
                exp /= 2;
            }
            return 1 / result;
        }
    }

    static void txtRead() { //записывает значения из файла input.txt в словарь dictionary
        File file = new File(inputPath);
        try (Scanner scanner = new Scanner(file)) {
            scanner.useDelimiter(System.getProperty("line.separator"));
            while (scanner.hasNext()) {
                String[] line = scanner.next().split(" ");
                dictionary.put(line[0], line[1]);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void txtWrite(double answer) { // записывает ответ в файл output.txt
        File file = new File(outputPath);
        try {
            PrintWriter pw = new PrintWriter(file);
            pw.printf("%.3f", answer);
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void setVar() {  //записывает значения из словаря dictionary в переменные value и exp
        value = Integer.parseInt(dictionary.get("a"));
        exp = Integer.parseInt(dictionary.get("b"));
    }
}