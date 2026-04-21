package lab10;

public class Worker extends Person {
    private String ajiltnykod;
    private String salbariinner;
    private String ajildorsonognoo;

    public Worker(String ner, String ovog, String register, String tursunudur,
                  String ajiltnykod, String salbariinner, String ajildorsonognoo) {

        super(ner, ovog, register, tursunudur);
        this.ajiltnykod = ajiltnykod;
        this.salbariinner = salbariinner;
        this.ajildorsonognoo = ajildorsonognoo;
    }

    public void info() {
        System.out.println("Ajilchnii medeelel:");
        super.info();
        System.out.println("Ajilchnii kod: " + ajiltnykod);
        System.out.println("Salbar: " + salbariinner);
        System.out.println("Ajild orson ognoo: " + ajildorsonognoo);
    }
}