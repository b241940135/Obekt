package lab08;

public class DisplayCard {

    private int memory;      
    private String chipset;
    private String brand;
    private double clockSpeed; 
    
    public DisplayCard(int memory, String chipset, String brand, double clockSpeed) {
        this.memory = memory;
        this.chipset = chipset;
        this.brand = brand;
        this.clockSpeed = clockSpeed;
    }

    public void printInfo() {
        System.out.println("  [DisplayCard] Brand: " + brand + 
                           ", Chipset: " + chipset + 
                           ", Memory: " + memory + "GB" + 
                           ", Clock: " + clockSpeed + "MHz");
    }
}
