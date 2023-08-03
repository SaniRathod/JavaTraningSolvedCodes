import java.util.*;
class GymMembers
{
int code;
float wt,ht,bmi;
String status;

void input()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter a Number code :");
code = sc.nextInt();
System.out.print("Enter a Number weight in kg:");
wt = sc.nextFloat();
System.out.print("Enter a Number height :");
ht = sc.nextFloat();
}

void process()
{
	bmi=wt/(ht*ht);
	if(bmi<20)
	status="UnderWeight";
	else
	if(bmi>25)
	status="Overweight";
	else
	status="Normal";
	}
	void output()
	{
		System.out.printf("%5d %10.3f %10.3f %10.3f %-15s\n",code,wt,ht,bmi,status);
	}

}

class ArrayOfObject
{
public static void main(String args[])
{

	//array of object creation+declaration
	GymMembers [] m = new GymMembers[1];

	//member of array creation
	for(int i=0;i<m.length;i++)
	m[i] = new GymMembers();

	//input
	for(int i=0;i<m.length;i++)
	m[i].input();
    //ptocess
    for(int i=0;i<m.length;i++)
	m[i].process();
	//output
	for(int i=0;i<m.length;i++)
	m[i].output();

}
}