package mon5date30;

//Superclass
class HillStations {
 void location() {
     System.out.println("Location is:");
 }

 void famousFor() {
     System.out.println("Famous for:");
 }
}

//Subclass Manali
class Manali extends HillStations {
 @Override
 void location() {
     System.out.println("Manali is in Himachal Pradesh");
 }

 @Override
 void famousFor() {
     System.out.println("It is Famous for Hadimba Temple and adventure sports");
 }
}

//Subclass Mussoorie
class Mussoorie extends HillStations {
 @Override
 void location() {
     System.out.println("Mussoorie is in Uttarakhand");
 }

 @Override
 void famousFor() {
     System.out.println("It is Famous for education institutions");
 }
}

//Subclass Gulmarg
class Gulmarg extends HillStations {
 @Override
 void location() {
     System.out.println("Gulmarg is in J&K");
 }

 @Override
 void famousFor() {
     System.out.println("It is Famous for skiing");
 }
}


public class Hillstationdemo {

	public static void main(String[] args) {
		  // Parent class reference
        HillStations hs;

        hs = new Manali();
        hs.location();
        hs.famousFor();

        hs = new Mussoorie();
        hs.location();
        hs.famousFor();

        hs = new Gulmarg();
        hs.location();
        hs.famousFor();
	}

}
