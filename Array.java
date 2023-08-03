import java.util.*;
class Array
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

	    //output array values
	    System.out.print("Enetr array values are :");
	    for(int i=0;i<10;i++)
	    System.out.print(a[i]+" ");

	    System.out.println();


  }
}


