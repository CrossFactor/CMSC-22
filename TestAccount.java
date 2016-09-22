/*
 * A Test Driver for the Account class.
 */
public class TestAccount {
   public static void main(String[] args) {
      // Test constructor and toString()
      Account ac1 = new Account(12345, 50);
      System.out.println(ac1);  // toString()
      // Test Setters and Getters, credit and debit
      ac1.setBalance(100);
      ac1.credit(50);
      System.out.println(ac1);  // run toString() to inspect credit and new setBalance
      ac1.debit(20);
      System.out.println("Account Number is: " + ac1.getAccountNumber()); // check Getters
      System.out.println("Balance is: " + ac1.getBalance()); // check new balance after debit
   }
}
