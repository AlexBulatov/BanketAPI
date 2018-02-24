package banket.Product;


public class Drink extends Product {
    public double percents;
    public double volume;

    public Drink(String title, int count, double price, double percents, double volume){
        super(title, count, price);
        this.percents = percents;
        this.volume = volume;
    }

    public Drink(){
        super();
        percents = 0;
        volume = 0;
    }
}
