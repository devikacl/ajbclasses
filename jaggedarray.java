package day9;
import java.util.Scanner;

public class jaggedarray {

	public static void main(String[] args) {
		
              int age[][] = new int[2][];
			     age[0] = new int[5];
			     age[1] = new int[3];

			     Scanner s = new Scanner(System.in);

			     for(int i=0; i<age.length ; i++)
			     {
			        for(int j=0;j<age[i].length;j++)
			        {
			             System.out.println("Enter the age of student " + (j+1) + " Batch " + (i+1));
			        age[i][j] = s.nextInt();
			        }
			     }

			     System.out.println("The ages are : ");
			      for(int i=0; i<age.length ; i++)
			     {
			        for(int j=0;j<age[i].length;j++)
			        {
			            System.out.println(age[i][j]);
			        }
			     }
			}
			}
