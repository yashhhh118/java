import java.lang.*;
import java.util.*;

class myException extends Exception
{
	public myException(String message)
	{
		super(message);
	}
}
public class UserExcp
{
	public static void main(String args[])
	{
		try
		{
			int a=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number=");
			a=sc.nextInt();
			if(a<5)//true
			throw new myException("Enter number greater than 5");
		}
		catch(myException e)
		{
			System.out.println(e.getMessage());
		}
	}
}