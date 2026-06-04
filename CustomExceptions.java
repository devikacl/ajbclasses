package mon6date4;
class InvalidPasswordException extends Exception
{
	
}
public class CustomExceptions {

	public static void main(String[] args) throws InvalidPasswordException {
		
		String id = "admin";
		int password = 12345;
		
		if(id.equals("admin"))
		{
			if(password == 1234)
			{
				System.out.println("Login successful");
			}
			else
			{
				try {
				InvalidPasswordException i = new InvalidPasswordException();
				throw i;
				}
				catch(InvalidPasswordException e)
				{
					System.out.println("Invalid password Entered!!");
				}
			}
		}
	}	
	}

