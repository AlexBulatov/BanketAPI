package banket;


public class Person{
    public String lastname;
    public String firstname;
    public String midllename;

    private boolean isPaid;

    public Person(String lastname, String firstname, String midllename){
        this.lastname=lastname;
        this.firstname=firstname;
        this.midllename=midllename;
        this.isPaid=false;
    }

    public void setPaidTrue(){ isPaid = true; }

    public boolean getPaid(){ return isPaid; }
}
