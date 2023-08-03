import java.util.*;
class FindSmallestNumber
{
public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   int number,i,smallestNumber,num;
	   int totalNumber=10;
	   System.out.print("Enter a number:");
	   number=sc.nextInt();
       smallestNumber=Integer.MAX_VALUE;
     for(i=1;i<=totalNumber;i++)
   {
	   num=sc.nextInt();
     if(num<smallestNumber)
     {
		 smallestNumber=num;
	 }
 }
   System.out.println("The Smallest Number is :"+ smallestNumber);

}
}