import processing.core.PApplet;

public class FourBallProcessing extends PApplet {

    public static final int Height = 480;
    public static final int Width = 640;
    public static final int Diameter = 10;
    public static int position = 0;

    public static void main(String[] args) {
        PApplet.main("FourBallProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(Width, Height);
    }

    @Override
    public void draw() {
        for (int number = 1; number<= 4; number++) {
            ball(number*position,number*Height/5);
        }
        position +=1;
    }

    private void ball(int positionX, int positionY) {
        ellipse(positionX,positionY,Diameter, Diameter);
    }

}