import java.util.*;
class EvenOddNumberFor
{
public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
	   int num,ec,oc;
	   ec=oc=0;

	   num=sc.nextInt();
     for(;;) //while(true)
     {
		 System.out.print("Enter a number:");
		 num=sc.nextInt();
	   if(num==0)
	   break;
	   if(num<=0)
	   continue;
	   if(num%2==0)
	   ec++;
	   else
	   oc++;

 }
    System.out.println("Total Odd Number is :"+oc );
    System.out.println("Total even Number is :"+ec);

}
}