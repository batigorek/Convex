// Класс "нульугольник", реализующий интерфейс фигуры.
import java.awt.*;
import java.awt.geom.Line2D;

class Void implements Figure {
    public double perimeter() {
        return 0.0;
    }
    public double area() {
        return 0.0;
    }
    public Figure add(R2Point p) {
        return new Point(p);
    }
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        R2Point p = null;
        R2Point R1 = p;
        Shape l = new Line2D.Double(1,1,10,10);
        g2.draw(l);
        return;
    }

}

