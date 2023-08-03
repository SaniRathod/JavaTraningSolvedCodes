class Student
{
    String name;
    int roll;
    String branch;
    int sem;
Student() //default constructor
{
   branch = "cs";
   sem = 7;
   }
   void setStudentInfo()
   {
	   this.name=name;
	   this.roll=roll;
   }
void display()
{
    System.out.print("Student Name="+name);
    System.out.print("Roll No="+roll);
    System.out.print("Branch="+branch);
    System.out.print("Semester="+sem);
}
}
class Constructor5
{
public static void main(String args[])
{
    Student s1,s2;
    s1=new Student();
    s2=new Student();
    s1.setStudentInfo("Vrushabh Hiwarale",27);
    s2.setStudentInfo("Pratham Chake",63);
    System.out.print("First Student \n-------------------");
    s1.display();
    System.out.print("Second Student \n-------------------");
    s2.display();
}
}