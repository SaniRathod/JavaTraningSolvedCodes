import java.util.Scanner;
class Circle
{
  double rad;

    void setRadius()
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the radius :");
       rad = sc.nextDouble();

     }
   void area()
    {
        double a = Math.PI*rad*rad;
        System.out.println("Area      :"+a);
    }
   void circumference()
       {
           double c = 2*Math.PI*rad;
           System.out.println("circumference    :"+c);
    }
}
  class Cylinder extends Circle
     {
        double ht;
        void setHeight()
        {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Height  :");
			ht = sc.nextDouble();
		}

     void volume()
       {
		  double v = Math.PI*rad*rad*ht;
		  System.out.println("Valume  :"+v);
       }
        void surfaceArea()
	          {
	   		  double sa = 2*Math.PI*rad*ht;
	   		  System.out.println("Surface Area     :"+sa);
       }

}
class  Inh2
{
    public static void main(String args[])
    {
       Cylinder c = new Cylinder();
       c.setRadius();
       c.setHeight();

         System.out.println("Base of Cylinder\n------------------");
         c.area();
         c.circumference();
         System.out.println("\nBody of Cylinder\n------------------");
         c.volume();
         c.surfaceArea();

    }
}