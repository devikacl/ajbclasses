package mon6date4;
//Custom Exception Class
class InsufficientBalanceException extends Exception {
 public InsufficientBalanceException(String message) {
     super(message);
 }
}

//Bank Class
class BankAccount {
 double balance;

 public BankAccount(double balance) {
     this.balance = balance;
 }

 public void withdraw(double amount) throws InsufficientBalanceException {
     if (amount > balance) {
         throw new InsufficientBalanceException("Insufficient Balance!");
     } else {
         balance -= amount;
         System.out.println("Withdrawal Successful.");
         System.out.println("Remaining Balance: ₹" + balance);
     }
 }
}
public class CustomExceptiondemo {

	public static void main(String[] args) {
		 BankAccount account = new BankAccount(5000);

	        try {
	            account.withdraw(6000);
	        } catch (InsufficientBalanceException e) {
	            System.out.println("Exception: " + e.getMessage());
	        }

	        System.out.println("Program Continues...");
	    }
	}
