import java.util.*;
class Kilometer
{
public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter a Size of lense :);
      int l1,l2,l3;
      l1=sc.nextInt();
      l2=sc.nextInt();
      l3=sc.nextInt();
      if(l1+l2>l3 && l2+l3>l1 &&l1+l3>l2);
      {
      System.out.println("It is valid");
      