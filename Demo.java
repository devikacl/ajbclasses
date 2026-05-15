package mon5date15;

//Class OS (Composition)
class OS {
 private String name;
 private int size;

 // Constructor
 OS(String name, int size) {
     this.name = name;
     this.size = size;
 }

 // Getter methods
 String getName() {
     return name;
 }

 int getSize() {
     return size;
 }
}

//Class Charger (Aggregation)
class Charger {
 private String brand;
 private int voltage;

 // Constructor
 Charger(String brand, int voltage) {
     this.brand = brand;
     this.voltage = voltage;
 }

 // Getter methods
 String getBrand() {
     return brand;
 }

 int getVoltage() {
     return voltage;
 }
}

//Class method
class Mobile {

 // Composition → Mobile has OS
 OS os = new OS("Android", 512);

 // Method using Aggregation
 void mobile(Charger c) {
     System.out.println("Charger Brand : " + c.getBrand());
     System.out.println("Charger Voltage : " + c.getVoltage());
 }
}

//Main class
public class Demo {

	public static void main(String[] args) {
		  // Aggregation object
        Charger c = new Charger("Oneplus", 25);

        // Mobile Method
        Mobile m = new Mobile();

        // Calling the Method
        m.mobile(c);

        // Composition output
        System.out.println("OS Name : " + m.os.getName());
        System.out.println("OS Size : " + m.os.getSize());
    }
}

