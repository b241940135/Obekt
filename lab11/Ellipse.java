package lab11;

public class Ellipse implements Shape{
    double a, b;
   public Ellipse(double a, double b) {
	   this.a=a;
	   this.b=b;
   }
   public double area() {
	   return Math.PI*a*a;
	   
   }
   public void display() {
	   System.out.println("Ellipse area:"+area());
   }
}
