import java.util.*;
class Factorial
{
public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   long n,b,i,c;
	   System.out.print("Enter a number:");
	   n=sc.nextLong();
       c=n;
     for(i=1;i<n;i++)
   {
      c *= i;
   System.out.println("Total number of Factorial is :"+c);

}
   }
   }