package Biedaalt2;

public class Testbuuz {	
	    public static void main(String[] args) {
	        Sharsanbuuz b1 = new Sharsanbuuz("Шарсан бууз", 10, 1500, "5 минут");
	        Jigensenbuuz b2 = new Jigensenbuuz("Жигнэсэн бууз", 8, 1200, "Дугуй");

	        System.out.println(" Шарсан бууз ");
	        b1.display();

	        System.out.println(" Жигнэсэн бууз");
	        b2.display();
	    }
	}