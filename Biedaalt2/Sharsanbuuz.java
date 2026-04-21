package Biedaalt2;

public class Sharsanbuuz extends Buuz {
	private String sharagdsanhugatsaa;
	
	public Sharsanbuuz(String ner, int too, double une, String sharagdsanhugatsaa) {
		super(ner, too, une);
		this.sharagdsanhugatsaa=sharagdsanhugatsaa;
	}
		public void display() {
			info();
			System.out.println("Шарсан хугацаа;"+ sharagdsanhugatsaa);
			System.out.println("Нийт үнэ:"+ niitUne());
	}


}
