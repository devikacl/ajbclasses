package mon5date30;

//Abstract Class
abstract class Vaccine {
 int age;
 String nationality;
 boolean firstDoseTaken = false;

 // Constructor
 Vaccine(int age, String nationality) {
     this.age = age;
     this.nationality = nationality;
 }

 // Concrete Method
 void firstDose() {
     if (nationality.equalsIgnoreCase("Indian") && age >= 18) {
         firstDoseTaken = true;
         System.out.println("Your First Dose Successfully Done. Now you have to pay 250 Rs");
     } else {
         System.out.println("You are not eligible for First Dose");
     }
 }

 // Concrete Method
 void secondDose() {
     if (firstDoseTaken) {
         System.out.println("Your Second Dose Successfully Done");
     } else {
         System.out.println("First Dose is not completed");
     }
 }

 // Abstract Method
 abstract void boosterDose();
}

//Implementation Class
class VaccinationSuccessful extends Vaccine {

 VaccinationSuccessful(int age, String nationality) {
     super(age, nationality);
 }

 @Override
 void boosterDose() {
     System.out.println("Your Booster Dose Successfully Done");
 }
}

public class Vaccination {

	public static void main(String[] args) {
		 VaccinationSuccessful v = new VaccinationSuccessful(18, "Indian");

	        v.firstDose();
	        v.secondDose();
	        v.boosterDose();
	}

}
