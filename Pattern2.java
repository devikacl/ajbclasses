package daydate21;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {    // spaces
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) { // print stars and spaces inside

                if (i == 1 || i == n || k == 1 || k == (2 * i - 1)) {    // first row OR last row OR borders
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
	}
}