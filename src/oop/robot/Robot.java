package oop.robot;
public class Robot {
    private int x; // текущая координата X
    private int y; // текущая координата Y
    private Direcrion direction; // текущее направление взгляда

    public Robot(int startX, int startY, Direcrion startDirection) {
        this.x = startX;
        this.y = startY;
        this.direction = startDirection;
    }

    public Direcrion getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (direction) {
            case UP:
                direction = Direcrion.LEFT;
                break;
            case LEFT:
                direction = Direcrion.DOWN;
                break;
            case DOWN:
                direction = Direcrion.RIGHT;
                break;
            case RIGHT:
                direction = Direcrion.UP;
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP:
                direction = Direcrion.RIGHT;
                break;
            case RIGHT:
                direction = Direcrion.DOWN;
                break;
            case DOWN:
                direction = Direcrion.LEFT;
                break;
            case LEFT:
                direction = Direcrion.UP;
                break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP:
                y++;
                break;
            case DOWN:
                y--;
                break;
            case LEFT:
                x--;
                break;
            case RIGHT:
                x++;
                break;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        // Перемещение по оси Y
        int deltaY = toY - robot.getY();
        Direcrion targetDirectionY = deltaY > 0 ? Direcrion.UP : Direcrion.DOWN;
        if (deltaY != 0) {
            while (robot.getDirection() != targetDirectionY) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(deltaY); i++) {
                robot.stepForward();
            }
        }

        // Перемещение по оси X
        int deltaX = toX - robot.getX();
        Direcrion targetDirectionX = deltaX > 0 ? Direcrion.RIGHT : Direcrion.LEFT;
        if (deltaX != 0) {
            while (robot.getDirection() != targetDirectionX) {
                robot.turnRight();
            }
            for (int i = 0; i < Math.abs(deltaX); i++) {
                robot.stepForward();
            }
        }
    }
}
// Описание задачи:
//
//На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
// Ось X смотрит слева направо,
// ось Y — снизу вверх. Вспомни, как рисовал графики функций в школе.
//
//В начальный момент робот находится в некоторой позиции на поле.
// Также известно, куда робот смотрит: вверх, вниз, направо или налево.
// Ваша задача — привести робота в заданную точку игрового поля.
//
//Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация тебе неизвестна):




