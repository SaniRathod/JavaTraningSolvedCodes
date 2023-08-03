import java.util.*;
class CheckNo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number :");
int n =sc.nextInt();
if(n>0)
System.out.println("Number is positive");
else
if(n<0)
System.out.println("Number is Nigative");
else
if(n==0)
System.out.println("Number is Zero");
}
}