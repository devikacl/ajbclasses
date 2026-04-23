package mo4date23;

public class Car {
	
	    String brand = "Toyota";
	    int speed = 120;

	    void display() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Speed: " + speed);
	    }

	public static void main(String[] args) {
		Car c1 = new Car();
        c1.display();

	}
	}
