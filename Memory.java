package lab08;

public class Memory {

	    private int size;          
	    private String type;       
	    private int speed;         
	    private String brand;     

	    public Memory(int size, String type, int speed, String brand) {
	        this.size = size;
	        this.type = type;
	        this.speed = speed;
	        this.brand = brand;
	    }

	    public void printInfo() {
	        System.out.println("Memory:");
	        System.out.println("\tSize   : " + size + " GB");
	        System.out.println("\tType   : " + type);
	        System.out.println("\tSpeed  : " + speed + " MHz");
	        System.out.println("\tBrand  : " + brand);
	    }
	}


