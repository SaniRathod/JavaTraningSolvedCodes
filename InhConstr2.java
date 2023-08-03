//super class - no constructor
//sub class - default constructor
class First
{
      First()
	  {
		  System.out.println("Inside class Second Constructor");

	  }
}
class Second extends First
  {

  }

   class InhConstr2
   {
	   public static void main(String args[])
	   {
		   Second obj=new Second();

	   }
   }