import java.util.*;
class Array2
{
public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		//Array declaration
	    int a [];
	    //Array creation
	    a = new int[10];
	    //input values of array
	    System.out.print("Enter 10 values of array :");
	    for(int i=0;i<10;i++)
	    a[i] = sc.nextInt();

	    //counting even odd values
	    int oc=0,oe=0;
	    for(int i=0;i<10;i++)
	      if(i%2==0)
	       oe++;
	       else
	       oc++;
	       //output
	    System.out.println("Total odd values are "+oc);
	    System.out.println("Total odd values are "+oe);


  }
}


