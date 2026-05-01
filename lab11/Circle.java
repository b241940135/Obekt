package lab11;

public class Circle implements Shape{
	double radius;
	public Circle(double radius) {
		this.radius=radius;		
	}
public double area() {
	return Math.PI* radius*radius;
	
}
	public void display() {
System.out.println("Circle area:"+ area());
}
}