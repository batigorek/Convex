// Класс "нульугольник", реализующий интерфейс фигуры.
import java.awt.*;

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

    public void draw(Graphics g){
    }

    @Override
    public int check(R2Point point1) {
        return 0;
    }
}

