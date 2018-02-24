package banket;

import banket.Product.Product;

import java.util.Date;
import java.util.List;

public class Banket {

    //region Getters-Setters

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Person getPartyOwner() {
        return partyOwner;
    }

    public void setPartyOwner(Person partyOwner) {
        this.partyOwner = partyOwner;
    }

    public List<Person> getGuests() {
        return guests;
    }

    public void setGuests(List<Person> guests) {
        this.guests = guests;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    private double getDrinkLitres(){
        return 0;
    }

    public double getTotalSum(){
        /*double result=0;
        for (Product product: products) {
            result+=product.getTotalPrice();
        }
        return result;*/
        return products.
                stream().
                filter(p -> p.count!=0).
                mapToDouble(Product::getTotalPrice).
                sum();
    }

    public Date getTimeOfParty() {
        return timeOfParty;
    }

    public void setTimeOfParty(Date timeOfParty) {
        this.timeOfParty = timeOfParty;
    }

    public void finishGatheringOfGuests(){
        guestsDone = true;
    }
    //endregion

    //region Data
    private String title; //Название бухича
    private Person partyOwner;
    private List<Person> guests;
    private List<Product> products;
    private Date timeOfParty;
    private boolean isEnded;
    private String partyPlace;
    private double drinkVolume;
    private boolean guestsDone=false;
    //endregion

    public void addPerson() {

    }

    public void addProduct() {

    }

    public double evaluateDrinkVolume(){
        return guests.stream().filter(p -> !p.isMale()).count()*0.75+
                guests.stream().filter(p -> p.isMale()).count()*1.5;
    }
}
