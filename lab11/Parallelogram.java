package lab11;

public class Parallelogram implements Shape {
    double base, height;

    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double area() {
        return base * height;
    }

    public void display() {
        System.out.println("Parallelogram area = " + area());
    }
}
