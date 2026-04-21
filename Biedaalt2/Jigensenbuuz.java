package Biedaalt2;

public class Jigensenbuuz extends Buuz{
	private String helber;

	public Jigensenbuuz(String ner, int too, double une, String helber) {
		super(ner, too, une);
		this.helber=helber;
	}
		public void display() {
			info();
			System.out.println("Хэлбэр;"+ helber);
			System.out.println("Нийт үнэ:"+ niitUne());
	}

}

