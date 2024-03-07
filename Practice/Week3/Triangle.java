package Week3;

public class Triangle {
    public int base;
    public int height;

    public Triangle(int a, int t) {
        base = a;
        height = t;
    }
    
    public double countArea() {
        return 0.5*base*height;
    }

    public double countPerimeter() {
        double side = Math.sqrt(Math.pow(base/2.0, 2) + Math.pow(height, 2));
        return 2*side+base;
    }
}