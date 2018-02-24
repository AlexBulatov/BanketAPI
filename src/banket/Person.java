package banket;


public class Person{
    //region Data
    private String lastname;
    private String firstname;
    private String midllename;
    private String telephone;
    private boolean isDrink;
    private boolean isPaid;
    private double sumOfPay;
    private boolean isMale;
    //endregion

    //region Getter-Setter
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public boolean getIsDrink() {
        return isDrink;
    }

    public void setDrink(boolean drink) {
        isDrink = drink;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMidllename() {
        return midllename;
    }

    public void setMidllename(String midllename) {
        this.midllename = midllename;
    }

    public void setPaidTrue(){ isPaid = true; }

    public boolean getPaid(){ return isPaid; }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }
    //endregion

    //region Constructors
    public Person(String lastname, String firstname, String midllename){
        this.lastname=lastname;
        this.firstname=firstname;
        this.midllename=midllename;
        this.isPaid=false;
        this.isDrink = true;
        this.telephone = null;
        this.sumOfPay = 0;
        this.isMale = true;
    }

    public Person(String lastname, String firstname, String midllename, String telephone){
        this(lastname, firstname, midllename);
        this.isMale = true;
        this.telephone = telephone;
        this.isDrink = true;
        this.isPaid=false;
        this.sumOfPay = 0;
    }

    public static Person createPerson (String lastname, String firstname, String midllename, String telephone, boolean isDrink){
        Person newPerson = new Person(lastname, firstname, midllename, telephone);
        newPerson.setDrink(true);
        return newPerson;
    }

    @Override
    public String toString() {
        return lastname + ' ' + firstname + ' ' + midllename;
    }
    //endregion
}
