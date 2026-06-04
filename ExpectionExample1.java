package mon6date4;

public class ExpectionExample1 {

	public static void main(String[] args) {
		int a[] = {10, 20, 30, 40};
		try {
		  System.out.println(a[4]);  
		}
		catch(ArithmeticException e)
		{
			System.out.println("Some problem occurred");
		}
		catch(NullPointerException e)
		{
			System.out.println("Some problem occurred");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("`Inside the finally block");
		}
	}
	}
