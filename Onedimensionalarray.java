package mon4date27;

import java.util.Scanner;

public class Onedimensionalarray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[5]; // Array to store 5 student ages

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            arr[i] = s.nextInt();
        }

        System.out.println("\nStudent Ages:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + arr[i]);
        }

        s.close();
    }
}

















