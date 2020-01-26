import java.awt.*;

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
    public void draw(Graphics g){
        g.fillOval((int)(p.getX() -4 ), (int)(p.getY()-4),8,8);
    }

    @Override
    public int check(R2Point point1) {
        return 0;
    }
}

