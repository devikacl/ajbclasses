package day4;

import java.util.Scanner;

public class marksvalidation {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter your marks (out of 100): ");
		  int marks = scanner.nextInt();
		  scanner.close();

		  if (marks < 0 || marks > 100) {
	      System.out.println("Invalid marks. Please enter marks between 0 and 100.");
		  } else if (marks >= 81) {
		  System.out.println("Distinction");
		  } else if (marks >= 60) {
		  System.out.println("First class");
		  } else if (marks >= 35) {
		  System.out.println("Second class");
		  } else {
		  System.out.println("Fail");
		        }
		    }
		}