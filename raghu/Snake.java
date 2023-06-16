package raghu;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Snake {
    private static final int INITIAL_LENGTH = 3;
    private static final int UP = -1;
    private static final int DOWN = 1;
    private static final int LEFT = -2;
    private static final int RIGHT = 2;

    private List<Point> body;
    private int direction;

    public Snake() {
        body = new ArrayList<>();
        direction = RIGHT;

        // Initialize the snake body
        int initialX = SnakeGame.GRID_WIDTH / 2;
        int initialY = SnakeGame.GRID_HEIGHT / 2;
        for (int i = 0; i < INITIAL_LENGTH; i++) {
            body.add(new Point(initialX - i, initialY));
        }
    }

    public List<Point> getBody() {
        return body;
    }

    public Point getHead() {
        return body.get(0);
    }

    public void handleKeyPress(int keyCode) {
        switch (keyCode) {
            case KeyEvent.VK_UP:
                if (direction != DOWN) {
                    direction = UP;
                }
                break;
            case KeyEvent.VK_DOWN:
                if (direction != UP) {
                    direction = DOWN;
                }
                break;
            case KeyEvent.VK_LEFT:
                if (direction != RIGHT) {
                    direction = LEFT;
                }
                break;
            case KeyEvent.VK_RIGHT:
                if (direction != LEFT) {
                    direction = RIGHT;
                }
                break;
        }
    }

    public void move() {
        Point head = new Point(getHead());
        switch (direction) {
            case UP:
                head.y--;
                break;
            case DOWN:
                head.y++;
                break;
            case LEFT:
                head.x--;
                break;
            case RIGHT:
                head.x++;
                break;
        }

        body.add(0, head);
        body.remove(body.size() - 1);
    }

    public void grow() {
        Point tail = body.get(body.size() - 1);
        body.add(new Point(tail));
    }

    public boolean isBodyCollision() {
        Point head = getHead();
        for (int i = 1; i < body.size(); i++) {
            if (head.equals(body.get(i))) {
                return true;
            }
        }
        return false;
    }
}