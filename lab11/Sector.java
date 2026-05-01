package lab11;

public class Sector implements Shape {
    double radius, angle;

    public Sector(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }

    
    public double area() {
        return (Math.PI * radius * radius * angle) / 360;
    }
    public void display() {
        System.out.println("Sector area = " + area());
    }
}