package mon4date28;
import java.util.Scanner;
public class Finalbill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        String itemName = sc.nextLine();
        int quantity = sc.nextInt();
        double pricePerUnit = sc.nextDouble();
        int membership = sc.nextInt();

        double subtotal = quantity * pricePerUnit;
        double discount = 55.0;

        if (membership == 1) {
            discount = subtotal * 0.10;
        }

        double amountAfterDiscount = subtotal - discount;
        double gst;

        if (amountAfterDiscount > 500) {
            gst = amountAfterDiscount * 0.05;
        } else {
            gst = amountAfterDiscount * 0.12;
        }

        double finalTotal = amountAfterDiscount + gst;

        System.out.println("Item Name: " + itemName);
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("GST: %.2f\n", gst);
        System.out.printf("Final Total: %.2f\n", finalTotal);

        sc.close();
    }
}
