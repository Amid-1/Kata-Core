package exeption.robotconnection;

public class Main {
    public static void main(String[] args) {
        RobotConnectionManager manager = new RobotConnectionManager() {
            @Override
            public RobotConnection getConnection() {
                return new RobotConnection() {
                    @Override
                    public void moveRobotTo(int x, int y) {
                        System.out.println("Робот переместился в " + x + ", " + y);
                    }

                    @Override
                    public void close() {
                        System.out.println("Соединение закрыто");
                    }
                };
            }
        };

        RobotController.moveRobot(manager, 5, 10);
    }
}
