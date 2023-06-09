package Proceeee;

public class Circle extends IShape{
    private double _radius;
    final double PI=3.14;
    public Circle(double _radius) {
        super();
        this._radius=_radius;
    }
    @Override
    public double getArea() {
        return PI*_radius*_radius;

    }
    @Override
    public String toString() {
        return "Circle radius=" + _radius + ", Area" + getArea() ;

    }
}