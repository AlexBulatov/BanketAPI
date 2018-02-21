package banket.Product;


public class Product{
    public String title;
    public int count;
    public double price;

    public Product(String title, int count, double price){
        this.title=title;
        this.count=count;
        this.price=price;
    }

    public Product(){
        count=0;
        price=0;
        title=null;
    }

    public double getTotalPrice(){
        return price*count;
    }
}

