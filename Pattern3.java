package daydate21;

public class Pattern3 {

	public static void main(String[] args) {
		int n = 3; // middle size
		for (int i = 1; i <= n; i++) { // upper part
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");// spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {  // stars + inner spaces

                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {   // lower part
            for (int j = 1; j <= n - i; j++) {  // spaces
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {  // stars + inner spaces

                if (k == 1 || k == (2 * i - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}