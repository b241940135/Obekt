package lab10;

public class Person {
    protected String ner;
    protected String ovog;
    protected String register;
    protected String tursunudur;

    public Person(String ner, String ovog, String register, String tursunudur) {
        this.ner = ner;
        this.ovog = ovog;
        this.register = register;
        this.tursunudur = tursunudur;
    }

    protected String getFullName() {
        if (ner != null && !ovog.isEmpty()) {
            return ner.substring(0, 1).toUpperCase() + "." + ovog;
        }
        return ner;
    }

    protected int getYear() {
        return Integer.parseInt(tursunudur.split("-")[0]);
    }

    protected void info() {
        System.out.println("Ner: " + getFullName());
        System.out.println("Register: " + register);
        System.out.println("Tursun on: " + getYear());
    }
}