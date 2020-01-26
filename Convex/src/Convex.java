import java.awt.*;

public class Convex {
    R2Point a,b;
    int i;
    private Figure fig;

    public Convex() {
        fig = new Void();
    }
    public Convex(R2Point a, R2Point b) {
        this.a=a;
        this.b=b;
        fig = new Void();
    }
    public void add(R2Point p) {
        fig = fig.add(p);
    }
    public void check() {
        System.out.println("Точек пересечения отрезка с оболочкой:");
        if (fig.check(a) > 0) {
            if (fig.check(b)>0) {
                System.out.println("0");
            }
            else System.out.println("1");
        } else if (fig.check(a)>0) {
            System.out.println("1");
        } else System.out.println("2");
    }
    public double area() {
        return fig.area();
    }
    public double perimeter() {
        return fig.perimeter();
    }

    public void draw(Graphics g) {
        g.fillOval((int)(a.getX() -4 ), (int)(a.getY()-4),8,8);
        g.drawLine((int)a.getX(), (int)a.getY(), (int)b.getX(), (int)b.getY());
        g.fillOval((int)(b.getX() -4 ), (int)(b.getY()-4),8,8);
        fig.draw(g);
    }
}
