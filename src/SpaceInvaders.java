import javax.swing.*;
import java.awt.*;

public class SpaceInvaders extends JFrame {

    final String TITLE_NAME = "Space Invaders";
    final int POINT_SCALE = 2;
    final int FIELD_WIDTH = 224 * POINT_SCALE;
    final int FIELD_HEIGHT = 256 * POINT_SCALE;
    final int START_LOCATION = 150;
    final int FIELD_DX = 7;
    final int FIELD_DY = 24;
    final int STEP_X = 5;
    final int STEP_Y = 15;
    final int GROUND_X = FIELD_HEIGHT - 20;
    final int LEFT = 37;
    final int RIGHT = 35;
    final int DOWN = 40;
    final int FIRE = 32;
    final int SHOW_DELAY = 20;
    final int [][][][]ALIEN_PATTERN ={
                {{{0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, {0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0}, {12}},
                        {{0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}}},
                {{{0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0}, {0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0}, {11}},
                        {{0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                        {1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 1, 1, 1, 0, 0, 1, 1, 1, 0, 0},
                        {0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0}, {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}}}
            };

    public static void main(String []args){
        new SpaceInvaders().go();
    }

    SpaceInvaders(){

    }

    class Canon{

    }

    class Ray{

    }

    class Alien{

    }

    class Wave{

    }

    void go(){

    }
    class Canvas extends JPanel{
        @Override
        public void paint(Graphics g){
            super.paint(g);

        }
    }
}
