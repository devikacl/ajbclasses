package mon6date4;

public class ExceptionExample5 {
	static void display() throws Exception
	{
		for(int i=1; i<=5; i++)
		{
		System.out.println(i);
		Thread.sleep(3000);
		}
	}
	public static void main(String[] args) {
		try {
			display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}
