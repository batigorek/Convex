import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    protected Convex f;
    public Frame (){
        this.setSize (1240,1240);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Frame (Convex convex){
        this();
        this.f=convex;
    }

    @Override
    public void paint (Graphics g){

        //g.setColor(new Color (164, 213, 255));
        //g.drawLine(20,20,100,100);
        // g.drawOval(200,200,100,100);
        //  g.fillOval(200,200,100,100);
        super.paintComponents(g);
        g.translate(getWidth()/2, getHeight()/2);
        g.drawLine(0-getWidth()/2,0,getWidth()/2,0);
        g.drawLine(0,0-getHeight()/2,0,getHeight()/2);
        f.draw(g);
    }

}
