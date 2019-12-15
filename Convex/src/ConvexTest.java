import javax.swing.*;
import java.awt.*;

public class ConvexTest {
    public static void main(String[] args) throws Exception {
        Convex convex = new Convex();
        Frame frame = new Frame(convex);
        int z = 0;
        while ( z != 2) {
            System.out.println("Введите коодинаты точек отрезка");
            convex.add(new R2Point1());
            z++;
        }
        while (true) {
            convex.add(new R2Point());
            System.out.println("S = " + convex.area() + " , P = "
                    + convex.perimeter());
            frame.repaint();
        }
    }

}
