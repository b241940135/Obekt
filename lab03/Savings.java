package lab03;

public class Savings {
    private String нэр;               
    private String валют;             
    private double жилийнХүү;         
    private int хугацааСараар;        
    private double эхнийҮлдэгдэл;     

    public Savings(String нэр, String валют, double жилийнХүү, int хугацааСараар, double эхнийҮлдэгдэл) {
        this.нэр = нэр;
        this.валют = валют;
        this.жилийнХүү = жилийнХүү;
        this.хугацааСараар = хугацааСараар;
        this.эхнийҮлдэгдэл = эхнийҮлдэгдэл;
    }

    private double хүүТооцоолох() {
        return (this.эхнийҮлдэгдэл * (this.жилийнХүү / 12.0) * this.хугацааСараар) / 100.0;
    }

    private double үлдэгдэлТооцоолох() {
        return this.эхнийҮлдэгдэл + хүүТооцоолох();
    }

    public void тайланХаруулах() {
        double нийтҮлдэгдэл = үлдэгдэлТооцоолох();
        double хүүнийХэмжээ = хүүТооцоолох();

        System.out.println("---------------------------------------------------------");
        System.out.printf("Та \"%s\"-д %,.1f%s-ийг %d сарын хугацаатай, \n", 
                          this.нэр, this.эхнийҮлдэгдэл, this.валют, this.хугацааСараар);
        System.out.printf("жилийн %.1f%%-ийн хүүтэй хадгалуулбал:\n\n", this.жилийнХүү);
        
        System.out.printf("Хадгаламжийн үлдэгдэл: %,.1f%s болно.\n", нийтҮлдэгдэл, this.валют);
        System.out.printf("Хуримтлагдсан хүү:     %,.1f%s байна.\n", хүүнийХэмжээ, this.валют);
        System.out.println("---------------------------------------------------------");
    }

   
    public static void main(String[] args) {

        Savings hadgalamj = new Savings(
                "Хаан банк",   // нэр
                "₮",           // валют
                12.0,          // жилийн хүү
                12,            // хугацаа (сар)
                1000000        // эхний мөнгө
        );

        hadgalamj.тайланХаруулах();
    }
}