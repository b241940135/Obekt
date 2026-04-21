package Biedaalt2;

public class Buuz{
	protected String ner;
	protected int too;
	protected double une;
public Buuz(String ner, int too, double une) {
this.ner=ner;
this.too=too;
this.une=une;
}
 protected double niitUne() {
	return too * une ;
 }
 public void info() {
	 System.out.println("Нэр:"+ ner);
	 System.out.println("Tоо:"+ too);
	 System.out.println("Нэгж үнэ:"+ une);
   }
}