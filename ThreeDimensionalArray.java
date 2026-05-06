package mon4date27;
import java.util.Scanner;

public class ThreeDimensionalArray {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[][][] age = new int[2][2][5];

        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.print("Enter the age of Student " + (k + 1)
                            + " in Batch " + (j + 1)
                            + " of Region " + (i + 1) + ": ");
                    age[i][j][k] = s.nextInt();
                }
            }
        }

        System.out.println("\nThe ages are:");

        for (int i = 0; i < age.length; i++) {
            System.out.println("Region " + (i + 1) + ":");
            for (int j = 0; j < age[i].length; j++) {
                System.out.println(" Batch " + (j + 1) + ":");
                for (int k = 0; k < age[i][j].length; k++) {
                    System.out.println("  Student " + (k + 1) + ": " + age[i][j][k]);
                }
            }
        }

        s.close();
    }
}