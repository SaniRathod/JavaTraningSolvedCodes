import java.util.*;
class Interchange
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st value :");
a=sc.nextInt();
System.out.println("Enter 1st value :");
b=sc.nextInt();
c=b;
b=a;
a=c;
System.out.print("The value interchange a is "+a+" and b is "+b);
}
}