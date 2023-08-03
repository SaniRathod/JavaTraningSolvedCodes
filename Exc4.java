import java.util.*;
class Exc4
{
	public static void main(String args[])
	{
		System.out.println("Program Starts....");
		Scanner sc=new Scanner(System.in);
		int d=0;
		try
		{
			System.out.print("Enter No1: ");
			int n1=sc.nextInt();
			System.out.print("Enter No2: ");
			int n2=sc.nextInt();
			d=n1/n2;

	    }
	    catch(ArithmeticException e)
	    {
			System.out.println("Error in  Data:Divisior should not bezero ");
		}
		 catch(InputMismatchException e)
			    {
					System.out.println("Error in  Data:Proper numeric value not provided ");
		}
		finally
		{
		      System.out.print("Division is :"+d);

		}
		     System.out.println("Program Ends....: ");
	}
}