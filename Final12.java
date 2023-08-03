//final method example
class A
{
	void first()
	{
		System.out.println("Inside method first");
	}
	final void Second()
		{
			System.out.println("Inside method Second");
	}
}

class B extends A
{
	void first()
	{
		System.out.println("Inside method first");
	}
	void Second()
		{
			System.out.println("Inside method Second");
	}
}



class Final12
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.first();
		obj.Second();

	}
}