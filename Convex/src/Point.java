import java.awt.*;
import java.awt.geom.Line2D;
import java.lang.management.GarbageCollectorMXBean;

// Класс "одноугольник", реализующий интерфейс фигуры.
class Point implements Figure {
    private R2Point p;
    public Point(R2Point p) {
        this.p = p;
    }
    public double perimeter() {
        return 0.0;
    }
    public double area() {
        return 0.0;
    }
    public Figure add(R2Point q) {
        if (!R2Point.equal(p,q)) return new Segment(p, q);
        else return this;
    }

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        R2Point R1 = p;
        Shape l = new Line2D.Double(1,1,10,10);
        g2.draw(l);
        return;
    }

}

