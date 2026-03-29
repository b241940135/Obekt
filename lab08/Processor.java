package lab08;

public class Processor {
    private String brand;
    private int cores;
    private double speed;
    private int cache;

    public Processor(String brand, int cores, double speed, int cache) {
        this.brand = brand;
        this.cores = cores;
        this.speed = speed;
        this.cache = cache;
    }

    public void printInfo() {
        System.out.println("processor (CPU)");
        System.out.println( brand);
        System.out.println( cores + " cores");
        System.out.println( speed + " GHz");
        System.out.println( cache + " MB");
    }
}