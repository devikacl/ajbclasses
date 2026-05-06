package mon5date5;

public class Bankexample {
	// Instance variable to store account balance
    double amount;

    // Constructor to initialize balance to 10000
    public Bankexample() {
        this.amount = 10000;
    }

    // Method to perform withdrawal after deposit if needed
    public void withdrawAfterDeposit(double withdrawAmount, double depositAmount) {

        // Check if balance is already enough
        if (withdrawAmount <= amount) {
            amount -= withdrawAmount;
            System.out.println("Withdrawal successful, available balance: " + amount);
        } else {
            // If not enough balance, deposit first
            amount += depositAmount;

            // Check again after deposit
            if (withdrawAmount <= amount) {
                amount -= withdrawAmount;

                // Final required output message
                System.out.println("Withdrawal successful after deposit, available balance: " + amount);
            } else {
                // If still not enough
                System.out.println("Insufficient balance even after deposit");
            }
        }
    }
    public static void main(String[] args) {
    	 // Create object of Bankexample class
        Bankexample acc = new Bankexample();

        /*
         * To get final balance = 10000:
         * Initial = 10000
         * Deposit = 5000  → 15000
         * Withdraw = 5000 → 10000
         */

        acc.withdrawAfterDeposit(15000, 15000);   }
}