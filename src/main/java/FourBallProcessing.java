import processing.core.PApplet;

import java.awt.*;

public class FourBallProcessing extends PApplet {

    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int Diameter = 10;
    public static int position = 0;
    public static final int SPEED_1 = 1;
    public static final int SPEED_2 = 2;
    public static final int SPEED_3 = 3;
    public static final int SPEED_4 = 4;
    int xCoordinate1 = 0;
    int xCoordinate2 = 0;
    int xCoordinate3 = 0;
    int xCoordinate4 = 0;


    public static void main(String[] args) {
        PApplet.main("FourBallProcessing",args);
    }

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    @Override
    public void setup() {
    }

    @Override
    public void draw() {
        ellipse(xCoordinate1 += SPEED_1, HEIGHT*1/5, Diameter, Diameter);
        ellipse(xCoordinate2 += SPEED_2, HEIGHT*2/5, Diameter, Diameter);
        ellipse(xCoordinate3 += SPEED_3, HEIGHT*3/5, Diameter, Diameter);
        ellipse(xCoordinate4 += SPEED_4, HEIGHT*4/5, Diameter, Diameter);
    }

}