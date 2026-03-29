package lab08;

public class Computer {
    private Processor processor;
    private Memory memory;
    private DisplayCard displayCard;
    private SoundCard soundCard;

    public Computer() {
      
        processor = new Processor("Intel Core i7", 8, 3.6, 16);
        memory = new Memory(16, "DDR4", 3200, "Kingston");
        displayCard = new DisplayCard(8, "RTX 3060", "NVIDIA", 1700);
        soundCard = new SoundCard();
    }

    public void showInfo() {
        System.out.println("********** КОМПЬЮТЕРЫН МЭДЭЭЛЭЛ **********");
        processor.printInfo();
        memory.printInfo();
        displayCard.printInfo();
        soundCard.printInfo();
        System.out.println();
    }
}