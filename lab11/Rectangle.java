package lab11;

public class Rectangle implements Shape {
double width ,height;
public Rectangle(double width, double height) {
	this.width=width;
	this.height=height;
}
public double area() {
	return width*height;
}
public void display() {
	System.out.println("Rectangle area:"+ area());
}
}
