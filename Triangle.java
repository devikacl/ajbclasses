package mon4date28;
import java.util.Scanner;
import java.util.Arrays;
public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Input three sides
		System.out.println("enter a value");
        int a = sc.nextInt();
        System.out.println("enter b value");
        int b = sc.nextInt();
        System.out.println("enter c value");
        int c = sc.nextInt();

        // Check if valid triangle
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Valid Triangle");

            // Classify triangle
            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

            // Check for right triangle
            int[] sides = {a, b, c};
            Arrays.sort(sides);

            if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]) {
                System.out.println("Right Triangle");
            } else {
                System.out.println("Not a Right Triangle");
            }
        } else {
            System.out.println("Invalid Triangle");
        }

        sc.close();
    }
}
