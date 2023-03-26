package org.example.Homework2;

public abstract class MovingObject implements Overcome {
    int maxDistance;
    int maxHeight;
    String typeObject;

    public MovingObject(int maxDistance, int maxHeight) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    @Override
    public boolean overcome(Obstacle obstacle) {
        if (obstacle.size <= (obstacle instanceof Treadmill ? maxDistance : maxHeight)) {
            System.out.printf("Препятствие: %s, %dм - преодолена\n", obstacle.typeObstacle, obstacle.size);
            return true;
        } else {
            System.out.printf("Препятствие: %s, %dм - не пройдена\n", obstacle.typeObstacle, obstacle.size);
            return false;
        }
    }
}
