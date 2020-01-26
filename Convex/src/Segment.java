import java.awt.*;

// Класс "двуугольник", реализующий интерфейс фигуры.
class Segment implements Figure {
    private R2Point p, q;
    public Segment(R2Point p, R2Point q) {
        this.p = p; this.q = q;
    }
    public double perimeter() {
        return 2.0 * R2Point.dist(p, q);
    }
    public double area() {
        return 0.0;
    }
    public Figure add(R2Point r) {
        if (R2Point.isTriangle(p, q, r))
            return new Polygon(p, q, r);
        if (q.inside(p, r)) q = r;
        if (p.inside(r, q)) p = r;
        return this;
    }
    public void draw(Graphics g){
        g.fillOval((int)(p.getX() -4 ), (int)(p.getY()-4),8,8);
        g.drawLine((int)p.getX(), (int)p.getY(), (int)q.getX(), (int)q.getY());
        g.fillOval((int)(q.getX() -4 ), (int)(q.getY()-4),8,8);
    }

    @Override
    public int check(R2Point point1) {
        return 0;
    }
}
