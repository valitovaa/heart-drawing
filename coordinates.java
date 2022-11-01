import javax.swing.*;
import java.awt.*;
import  java.awt.geom.*;

public class DrawingCanvas extends JComponent {
    private int width;
    private int height;

    private Cloud c1;
    private Cloud c2;
    private Cloud c3;

    public DrawingCanvas(int w, int h){
        this.height = h;
        this.width = w;
        c1 = new Cloud(10,50,75,Color.BLUE);
        c2 = new Cloud(200,75,90,Color.BLACK);
        c3 = new Cloud(33,66,89,Color.GREEN);
    }
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Path2D.Double heart = new Path2D.Double();
        heart.moveTo(328,256);
        heart.curveTo(329,204,397,199,401,252);
        heart.curveTo(402,200,470,195,474,248);
        heart.curveTo(465, 304,415,345,402,350);
        heart.curveTo(388,346,328,308,328,256);
        g2d.setColor(Color.PINK);
        g2d.fill(heart);


    }
}
