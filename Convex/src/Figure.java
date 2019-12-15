import  java.awt.*;

public interface Figure {
    public double perimeter();
    public double area();
    public Figure add(R2Point p);
    void draw(Graphics g);
}
