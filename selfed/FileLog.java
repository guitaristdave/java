package selfed;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLog {
    public static void main(String[] args) throws IOException {
        Logger logger = (Logger) log();
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

        }
        
    public static Object log() throws IOException {
        Logger logger = Logger.getLogger(Log.class.getName());
        FileHandler fh = new FileHandler("selfed/text.log");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        return logger;
    }
}
   















    // static Logger logger = Logger.getLogger(FileLog.class.getName());
    // FileHandler fh = new FileHandler("selfed/text.log");



    //     // logger.addHandler(fh);
    //     // SimpleFormatter formatter = new SimpleFormatter();
    //     // fh.setFormatter(formatter);
    

    

    

    

