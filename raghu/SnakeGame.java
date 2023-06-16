package raghu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int GRID_SIZE = 20;
    static final int GRID_WIDTH = WIDTH / GRID_SIZE;
    static final int GRID_HEIGHT = HEIGHT / GRID_SIZE;

    private Snake snake;
    private Apple apple;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        snake = new Snake();
        apple = new Apple();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                snake.handleKeyPress(e.getKeyCode());
            }
        });

        GameLoop gameLoop = new GameLoop();
        gameLoop.start();
    }

    private class GameLoop extends Thread {
        private boolean running = true;

        @Override
        public void run() {
            while (running) {
                snake.move();
                checkCollision();

                repaint();

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        public void stopLoop() {
            running = false;
        }
    }

    private void checkCollision() {
        Point head = snake.getHead();

        // Check collision with apple
        if (head.equals(apple.getPosition())) {
            snake.grow();
            apple.generateNewPosition();
        }

        // Check collision with walls
        if (head.x < 0 || head.x >= GRID_WIDTH || head.y < 0 || head.y >= GRID_HEIGHT) {
            gameOver();
        }

        // Check collision with itself
        if (snake.isBodyCollision()) {
            gameOver();
        }
    }

    private void gameOver() {
        JOptionPane.showMessageDialog(this, "Game Over", "Snake Game", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Clear the screen
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH, HEIGHT);

        // Draw the snake
        g.setColor(Color.GREEN);
        for (Point bodyPart : snake.getBody()) {
            g.fillRect(bodyPart.x * GRID_SIZE, bodyPart.y * GRID_SIZE, GRID_SIZE, GRID_SIZE);
        }

        // Draw the apple
        g.setColor(Color.RED);
        g.fillRect(apple.getPosition().x * GRID_SIZE, apple.getPosition().y * GRID_SIZE, GRID_SIZE, GRID_SIZE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SnakeGame game = new SnakeGame();
            game.setVisible(true);
        });
    }
}