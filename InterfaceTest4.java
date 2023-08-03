//class can extends  another class and at the same time implements one or more interfaces
class Base
{
	int a,b;
	void setData(int a,int b)
	{
		this.a = a;
		this.b = b;

	}
	void display()
	{
		System.out.println("a = "+a+"\t b = "+b);

	}

}
interface Sample
{
	void SampleMethod();

}

class MyClass extends Base implements Sample
{
     public void sampleMethod()
     {
		 System.out.println("Addition :"+ (a+b));
	 }
}
class InterfaceTest4
{
	public static void main(String args[])
	{
		MyClass obj=new MyClass();
		obj.setData(58,57);
		obj.display();
		obj.sampleMethod();

	}

}