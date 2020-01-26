import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private Convex c, c1;
    public Frame (Convex c){
        this.c =c;
        this.setSize (1240,1240);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint (Graphics g){
        g.translate(getWidth()/2, getHeight()/2);
        g.drawLine(0-getWidth()/2,0,getWidth()/2,0);
        g.drawLine(0,0-getHeight()/2,0,getHeight()/2);
        this.repaint();
        c.draw(g);
    }
}
