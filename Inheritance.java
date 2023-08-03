class First
{
  void method1()
  {
	  System.out.println("Inside method1");
  }
   void method2()
    {
  	  System.out.println("Inside method2");
  }
}

class Second extends First
{
  void method3()
  {
	  System.out.println("Inside method3");
  }
   void method4()
    {
  	  System.out.println("Inside method4");
  }
}

public class  Inheritance
{
    public static void main(String args[])
    {
      Second obj=new Second();
      obj.method1();
      obj.method2();
      obj.method3();
    }
}