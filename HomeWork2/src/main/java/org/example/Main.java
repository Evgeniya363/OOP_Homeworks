package org.example.Homework2;

public class Main {
    public static void main(String[] args) {
        MovingObject[] movingObject = {
                new Human(200, 2),
                new Robot(250, 3),
                new Cat(300, 5),
                new Human(300, 4),
        };
        Obstacle obstacle[] = {
                new Wall(1),
                new Treadmill(50),
                new Wall(2),
                new Treadmill(100),
                new Wall(3),
                new Treadmill(200),
                new Wall(4),
                new Treadmill(300)
        };
        for (MovingObject mo : movingObject) {
            System.out.println("\n"+mo.typeObject + " вышел на полосу препятствий");
            System.out.println("-".repeat(35));
            boolean flag=true;
            for (Obstacle ob : obstacle) {
                flag = mo.overcome(ob);
                if (!flag) break;
            }
            if (flag) System.out.println("Дистанция пройдена");
            else System.out.println("Дистанция не была пройдена");
        }
    }
}
