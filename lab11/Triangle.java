package lab11;

public class Triangle implements Shape{
double base, height;
public Triangle(double base, double height) {
	this.base=base;
	this.height=height;	
}
public double area() {
	return (base*height) / 2;
}
public void display() {
	System.out.println("Triangle area:"+ area());

    }
}