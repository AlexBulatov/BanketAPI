package banket.Product;

enum FoodType {
    Appetizer,
    Meat,
    Vegan,
    Snack
}

public class Food extends Product {
    public FoodType type;

    public Food(String title, int count, double price, FoodType type){
        super();
        this.type = type;
    }
}
