import java.util.*;
class Loop
{
public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   long number,sum,i;
	   int totalNumber=30;
	   System.out.print("Enter a number:");
	   number=sc.nextLong();
        sum=0;
     for(i=1;i<=number;i++)
   {
      sum += number;
   }
   long average=(long)sum/totalNumber;

   System.out.println("Sum :"+sum);
   System.out.println("Average :"+average);
}
}