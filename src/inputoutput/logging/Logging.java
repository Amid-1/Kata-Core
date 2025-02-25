package inputoutput.logging;

import java.util.logging.Logger;

public class Logging {
    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test"); // Задаем правильное имя

        logger.info("Все хорошо");
        logger.warning("Произошла ошибка");
    }

    public static void main(String[] args) {
        logging();
    }
}