package lab11;

public class Trapezoid implements Shape{
	double a, b, height;
public Trapezoid(double a, double b, double height) {
    this.a=a;
   	this.b=b;
   	this.height=height;
}
public double area() {
	return((a+b)/2)*height;
}
public void display() {
	System.out.println("Trapezoid area:"+ area());
}
}