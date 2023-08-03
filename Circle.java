import java.util.*;
class Circle
{
public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Redius:");
      int r=sc.nextInt();
      double p=Math.PI*r*r;
      double q=2*Math.PI*r;
    System.out.println("Thae area of circle is :"+p);
      System.out.println("Thae circureference of circle is :"+q);
   }
}

