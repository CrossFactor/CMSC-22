public class Account{
  private int accountNumber;
  private double balance;

  public Account(int accountNumber, double balance){
    this.accountNumber = accountNumber;
    this.balance = balance;
  }
 //missing public Account(int accountNumber)
  public int getAccountNumber(){
    return this.accountNumber;
  }

  public double getBalance(){
    return this.balance;
  }

  public void setBalance(double balance){ //needs check if balance is less than 0
    if (balance < 0){
      throw new IllegalArgumentException("Invalid balance: Balance below 0");
    }
    this.balance = balance;
  }

  public void credit(double amount){
    this.balance += amount;
  }

  public void debit(double amount){
    if (amount > this.balance){
      throw new IllegalArgumentException("Day below 1 is invalid");
    }
    this.balance -= amount;
  }

  public String toString(){
    return String.format("Account number: %d, Balance: %.2f", accountNumber, balance);
  }
}
