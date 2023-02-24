package selfed;


import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Log {
    public static void main(String[] args) {
        System.out.println(Sum(2, 0));
    }
    static Logger logger = Logger.getLogger(Log.class.getName());
    ConsoleHandler filelog = new ConsoleHandler();

    static int Sum (int n, int m) {
        try {
            logger.log(Level.INFO, "Метод Sum запущен");
            int result = n / m;
            logger.log(Level.INFO, "Сложили n и m");
            logger.log(Level.INFO, "Возвращаем сумму");
            return result;   
        } catch (Exception e){
            logger.log(Level.WARNING,"что-то пошло не так" , e);
            return 0;
        }
    }
}
