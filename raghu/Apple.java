package raghu;

import java.awt.*;
import java.util.Random;

public class Apple {
    private Point position;
    private Random random;

    public Apple() {
        position = new Point();
        random = new Random();
        generateNewPosition();
    }

    public Point getPosition() {
        return position;
    }

    public void generateNewPosition() {
        int x = random.nextInt(SnakeGame.GRID_WIDTH);
        int y = random.nextInt(SnakeGame.GRID_HEIGHT);
        position.setLocation(x, y);
    }
}
