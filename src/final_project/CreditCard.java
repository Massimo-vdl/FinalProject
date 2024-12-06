package final_project;

/**
 *
 * @author massi
 */
public class CreditCard {
private Person owner;
private Money balance;
private Money creditLimit;
//Constructor
public CreditCard(Person owner, Money creditLimit){
    this.owner = owner;
    this.balance = new Money(0);
    this.creditLimit = new Money (creditLimit);
}
//getters and setters 
public Money getBalance(){
    return this.balance;
}

public Money getCreditLimit(){
    return new Money(this.creditLimit);
}
//retrieving the information from the person 
public String getPersonals(){
    return owner.toString();
}//Charging money adding to the balance 
public void charge(Money amount){ //using the compare to ethod to see if the charge exceeds the limit
    if (amount.compareTo(getCreditLimit().subtract(getBalance())) == 1) {
        System.out.println("Exceeds credit limit");
    } else {
        this.balance = getBalance().add(amount);
        System.out.println("Charge: "+ amount);
        }
}
public void payment(Money amount){
    this.balance = getBalance().subtract(amount);
        System.out.println("Payment: "+ amount);
    }
}   

