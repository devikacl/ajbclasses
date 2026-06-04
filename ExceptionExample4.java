package mon6date4;
class Demo
{
    void fun() throws ArithmeticException
	{
		System.out.println(10/0);
	}
}
public class ExceptionExample4 {

	public static void main(String[] args) {
		Demo d = new Demo();
		   try {
			d.fun();
		   }
		   catch(ArithmeticException e)
		   {
			   e.printStackTrace();
		   }		
		}
	}
