package oop.robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(0, 0, Direcrion.UP);

        System.out.println("Начальная позиция: x=" + robot.getX() + ", y=" + robot.getY());
        System.out.println("Направление: " + robot.getDirection());

        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.turnLeft();
        robot.stepForward();

        System.out.println("Финальная позиция: x=" + robot.getX() + ", y=" + robot.getY());
        System.out.println("Направление: " + robot.getDirection());
    }
}
