package mon4date27;

import java.util.Scanner;

public class Twodimensionalarray {

    public static void main(String[] args) {

        int age[][] = new int[2][5];

        Scanner s = new Scanner(System.in);

        // Taking input
        for (int i = 0; i < age.length; i++) {
            for (int j = 0; j < age[i].length; j++) {
                System.out.println("Enter the age of student " + (j + 1) + " in batch " + (i + 1));
                age[i][j] = s.nextInt();
            }
        }

        // Printing output
        System.out.println("The ages are:");
        for (int i = 0; i < age.length; i++) {
            System.out.println("Batch " + (i + 1) + ":");
            for (int j = 0; j < age[i].length; j++) {
                System.out.println("Student " + (j + 1) + ": " + age[i][j]);
            }
        }

        s.close();
    }
}