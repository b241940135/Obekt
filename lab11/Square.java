package lab11;

public class Square implements Shape {
double side;
public Square(double side) {
	this.side=side;
}
public double area () {
	return side*side;
}
public void display() {
	System.out.println("Square area=" + area());
   }	

}
