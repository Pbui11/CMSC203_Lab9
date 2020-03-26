//Create a new class called SavingsAccount that extends BankAccount
public class SavingsAccount extends BankAccount {

//It should contain an instance variable called rate that represents the annual interest rate
private double rate;

//It should also have an instance variable called savingsNumber 

private int savingsNumber = -1; 

//In this bank, you have one account number, but can have several savings accounts with that same number
private String accountNumber;

//Write a constructor that take a name and an initial balance as parameters
public SavingsAccount(String name, double initialBalance) {

super(name, initialBalance); //call the constructor for the superclass

accountNumber = "";

rate = 2.5; //set the rate equal to 2.5%

}

//Write a copy constructor that creates another savings account for the same person. It should take the original savings account and an initial balance as parameters
public SavingsAccount(SavingsAccount oldAccount, double amount) {

super(oldAccount, amount); // call the copy constructor of the superclass

savingsNumber += 1; //assign the accountNumber to be one more than the savingsNumber of the original savings account

}
//Write a method called postInterest that has no parameters and returns no value. This method will calculate one month's worth of interest on the balance and deposit it into the account 
public void postInterest() {

rate = (rate / 100) / 12;

setBalance((getBalance() * rate) + getBalance());

}

//Write a method that overrides the getAccountNumber method in the superclass
public String getAccountNumber() {

savingsNumber += 1;

//each individual savings account is identified by the number following a dash
accountNumber = super.getAccountNumber() + "-" + savingsNumber;

return accountNumber;

}

}