import java.util.*;
class Exc3
{
	public static void main(String args[])
	{
		System.out.println("Program Starts....");
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter No1: ");
			int n1=sc.nextInt();
			System.out.print("Enter No2: ");
			int n2=sc.nextInt();
			int d=n1/n2;
			System.out.print("Division is :"+d);

	    }
	    catch(ArithmeticException e)
	    {
			System.out.println("Error in  Data:Divisior should not bezero ");
		}
		 catch(InputMismatchException e)
			    {
					System.out.println("Error in  Data:Proper numeric value not provided ");
		}
		     System.out.println("Program Ends....: ");
	}
}