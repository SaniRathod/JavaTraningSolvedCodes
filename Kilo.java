import java.util.*;
class Kilo
{
public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter values in kilometer :");
      double a=sc.nextDouble();
       double m;
       m=a*1000f;
    System.out.println("The value in km is "+a+" and the conversion in meter is "+m);
       m=a*100000f;
    System.out.println("The value in km is "+a+" and the conversion in Centemeter is "+m);
       m=a*1000000f;
    System.out.println("The value in km is "+a+" and the conversion in Milimeter is "+m);
        m=a*3289.84f;
    System.out.println("The value in km is "+a+" and the conversion in Feet is "+m);
        m=a*39370.1f;
    System.out.println("The value in km is "+a+" and the conversion in Inches is "+m);
   }
}

