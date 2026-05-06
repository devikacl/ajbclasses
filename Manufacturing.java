package mon4date28;
import java.util.Scanner;
public class Manufacturing {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

		   System.out.println("enter the n value");
	        int n = sc.nextInt();

	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int j = 1; j <= i; j++) {
	                System.out.print("*");
	            }

	            // Move to next line
	            System.out.println();
	        }

	        sc.close();
	    }
	}
