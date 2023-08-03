import java.util.*;
class Jan1day
{
public static void main(String args[])
    {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter any year :");
	   int yr = sc.nextInt();
	   int pryr = yr-1;
	   int tnd = pryr*365;
	   int tld = pryr/4-pryr/100 + pryr/400;
	   int td = tnd + tld;
	   int d=td%7;
	   String msg = "Day on 1 January "+yr+" : ";
	   switch(d)
	   {
		   case 0: msg+="Monday"; break;
		   case 1: msg+="Tuesday"; break;
		   case 2: msg+="Wednesday"; break;
		   case 3: msg+="Thursday"; break;
		   case 4: msg+="Friday"; break;
		   case 5: msg+="Saturday"; break;
		   case 6: msg+="Sunday"; break;

	}
    System.out.println(msg);

}
}