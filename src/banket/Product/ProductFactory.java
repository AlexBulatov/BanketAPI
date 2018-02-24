package banket.Product;

public class ProductFactory {
    public Product createProduct(boolean isDrink){
        if (isDrink) {
            return new Drink();
        }
        else {
            return new Food();
        }
    }
}
