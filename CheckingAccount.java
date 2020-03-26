//Create a new class called CheckingAccount that extends BankAccount
public class CheckingAccount extends BankAccount {

//It should contain a static constant FEE that represents the cost of clearing one check
private static final double FEE = 0.15; //set it equal to 15 cents

//Write a constructor that takes a name and an initial amount as parameters

public CheckingAccount(String name, double initialAmount) {

super(name, initialAmount); //call the constructor for the superclass

//It should initialize accountNumber to be the current value in accountNumber concatenated with -10
setAccountNumber(getAccountNumber() + "-10");

}

//Write a new instance method, withdraw, that overrides the withdraw method in the superclass. This method should take the amount to withdraw, add to it the fee for check clearing, and call the withdraw method from the superclass.
 
public boolean withdraw(double amount) {

amount += FEE;

return super.withdraw(amount);

}

}