import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Snake extends JFrame {
    final String NAME = "Snake";
    final int POINT_SIZE = 2;
    final int WALL = 10;
    final int WEIGHT = 300 + WALL;
    final int HEIGHT = 300 + WALL;
    ArrayList <Body> snake = new ArrayList<Body>();
    final int[][] BODY_PATTERN = {
            {0, 1, 1, 1, 1, 0},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1, 1},
            {0, 1, 1, 1, 1, 0}
    };

    class Body{
        int x;
        int y;
        Body(int x, int y) {
            this.x = x;
            this.y = y;
        }
        int getX(){
            return x;
        }
        int getY(){
            return y;
        }
        void SetX(int x){
            this.x = this.x;
        }
        void SetY(int y){
            this.y = y;
        }
    }

    void move(){
        snake.get(0).SetX(snake.get(0).getX());
        snake.get(0).SetY(snake.get(0).getY());
        for(Body b: snake){

        }
    }

    class Canvas extends JPanel{
        @Override
        public void paint(Graphics g){
            super.paint(g);
        }
    }

    Snake(){

    }
}
