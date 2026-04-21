package day4;

public class Matrimony {
	public static void main(String[] args) {

        char gender = 'M';   // change to 'F' if needed
        int age = 22;

        if (gender == 'M') {
            if (age >= 21) {
                System.out.println("Eligible to get married");
            } else {
                System.out.println("Not eligible to get married");
            }
        } else if (gender == 'F') {
            if (age >= 18) {
                System.out.println("Eligible to get married");
            } else {
                System.out.println("Not eligible to get married");
            }
        } else {
            System.out.println("Invalid gender");
        }
    }
}