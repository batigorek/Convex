import javax.swing.*;
import java.awt.*;

public class ConvexTest {
    private static int i;
    public static void main(String[] args) throws Exception {

        System.out.println("Введите коодинаты точек отрезка");
        Convex convex = new Convex(new R2Point(),new R2Point());
        Frame f = new Frame(convex);
        f.repaint();
      //  f.setBackground(Color.white);
        System.out.println("Введите коодинаты точек отрезка");
            while(true)
            {
            convex.add(new R2Point());
            System.out.println("S = " + convex.area() + " , P = " + convex.perimeter());
            f.repaint();
            if (i>1){
                convex.check();
            }
            i++;
            }
    }

}
