package mon6date4;

public class ExpectionExample3 {

	public static void main(String[] args) {
		 for (int i = 1; i <= 5; i++) {
	            System.out.println(i);

	            try {
	                Thread.sleep(2000);
	            } catch (InterruptedException e) {
	                System.out.println("Thread interrupted!");
	            }
	        }
	    }
	}