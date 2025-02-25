package exeption.robotconnection;

public class RobotController {
    public static void moveRobot(RobotConnectionManager robotCollectionManager, int toX, int toY) {
        RobotConnection connection = null;

        // Первая попытка
        try {
            connection = robotCollectionManager.getConnection();
            connection.moveRobotTo(toX, toY);
            return;
        } catch (RobotConnectionException e1) {
            // Игнорируем первую ошибку и пробуем снова
        } catch (Exception e) {
            throw e;  // Если исключение не RobotConnectionException, выбрасываем сразу
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ignored) {
                }
            }
        }

        // Вторая попытка
        connection = null;
        try {
            connection = robotCollectionManager.getConnection();
            connection.moveRobotTo(toX, toY);
            return;
        } catch (RobotConnectionException e2) {
            // Игнорируем вторую ошибку и пробуем снова
        } catch (Exception e) {
            throw e;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ignored) {
                }
            }
        }

        // Третья попытка (последняя)
        connection = null;
        try {
            connection = robotCollectionManager.getConnection();
            connection.moveRobotTo(toX, toY);
            return;
        } catch (RobotConnectionException e3) {
            // Если третья попытка не удалась, выбрасываем исключение
            throw new RobotConnectionException("Не удалось подключиться к роботу после трех попыток.");
        } catch (Exception e) {
            throw e;
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ignored) {
                }
            }
        }
    }
}

// Реализация метода getConnection и try-with-resources​

// public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//        boolean isMoved = false;  // Флаг успешного перемещения
//
//        for (int attempt = 1; attempt <= 3; attempt++) {
//            try (RobotConnection connection = robotConnectionManager.getConnection()) {
//                connection.moveRobotTo(toX, toY);
//                isMoved = true;  // Если дошли до этой строки — робот переместился
//                return;  // Выход из метода после успешного перемещения
//            } catch (RobotConnectionException e) {
//                if (attempt == 3 && !isMoved) {  // Если последняя попытка провалилась — выбрасываем исключение
//                    throw new RobotConnectionException("Не удалось подключиться к роботу после трех попыток.", e);
//                }
//            } catch (Exception e) {
//                throw e;  // Любые другие исключения выбрасываем сразу
//            }
//        }
//    }


// реализация с циклом вместо трех try
//public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
//    final int MAX_ATTEMPTS = 3;
//    for (int attempt = 1; attempt <= MAX_ATTEMPTS; attempt++) {
//        RobotConnection connection = null;
//        try {
//            connection = robotConnectionManager.getConnection();
//            connection.moveRobotTo(toX, toY);
//            return; // Успешно переместили робота, выходим из метода
//        } catch (RobotConnectionException e) {
//            if (attempt == MAX_ATTEMPTS) {
//                throw new RobotConnectionException("Не удалось подключиться к роботу после трех попыток.", e);
//            }
//        } catch (Exception e) {
//            throw e; // Любое другое исключение пробрасываем сразу
//        } finally {
//            if (connection != null) {
//                try {
//                    connection.close();
//                } catch (Exception ignored) {
//                }
//            }
//        }
//    }
//}




// Реализация метода getConnection​
//
//
//Вспомним нашего старого знакомого робота. Теперь мы будем давать роботу команды удаленно, подключаясь к нему
// по беспроводному каналу связи.
//
//Подключение к роботу представляется в программе интерфейсом RobotConnection:
//
//public interface RobotConnection extends AutoCloseable {
//    void moveRobotTo(int x, int y);
//    @Override
//    void close();
//}
//
//
//
//
//Да, робот с тех пор поумнел и стал понимать команду на перемещение в заданную точку (метод moveRobotTo). Ему
// больше не нужны пошаговые инструкции.
//
//RobotConnection - это временно устанавливаемое соединение, которое надо закрывать, когда оно больше не нужно.
// Для закрытия соединения в интерфейсе есть метод close().
//
//За установку соединения отвечает RobotConnectionManager:
//
//public interface RobotConnectionManager {
//    RobotConnection getConnection();
//}
//
//
//
//
//Метод getConnection() делает попытку соединиться с роботом и возвращает установленное соединение, через которое
// можно отдавать роботу команды.
//
//Установка соединения может завершиться неуспешно, а также уже установленное соединение может внезапно
// разорваться.
// Всякое бывает. Поэтому любой метод RobotConnectionManager и RobotConnection может бросить непроверяемое
// исключение RobotConnectionException:
//
//public class RobotConnectionException extends RuntimeException {
//
//    public RobotConnectionException(String message) {
//        super(message);
//
//    }
//
//    public RobotConnectionException(String message, Throwable cause) {
//        super(message, cause);
//    }
//}
//
//
//Ваша задача - реализовать метод который устанавливает соединение с роботом, отдает ему команду на перемещение
// в заданную точку и затем закрывает соединение, выполняя при необходимости повтор этой последовательности
// до трех раз.
//
//При этом:
//
//Попытка отдать команду роботу считается успешной, если удалось установить соединение и выполнить метод
// RobotConnection.moveRobotTo() без исключений. Ошибка закрытия соединения не важна и должна игнорироваться.
//
//Если первая попытка подключиться и отдать команду оказалась неуспешной, то закрываем соединение и выполняем
// вторую попытку. Если вторая тоже не удалась, то выполняется третья. После третьей неудачи метод должен бросить
// исключение RobotConnectionException.
//
//Метод отвечает за открытие и закрытие соединения. Если соединение удалось установить, то оно обязательно
// должно быть закрыто несмотря на возможные исключения, случившиеся в дальнейшем во время работы метода.
//
//Если во время работы метода случилось исключение любого типа, отличного от RobotConnectionException, метод
// должен завершиться и выбросить это исключение, не выполняя повторных попыток пообщаться с роботом.
// Единственное, что метод должен сделать перед выбросом этого исключения — закрыть открытое соединение
// RobotConnection.
//
//В решение должен использоваться классический try-catch.