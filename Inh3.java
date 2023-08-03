class Persion
{
  String name;
  int age;

    void setInfo(String name,int age)
     {
        this.name = name;
        this.age = age;
     }
   void display()
    {
    System.out.println("Name    :"+name);
    System.out.println("Age     :"+age);
    }
}
  class Student extends Persion
     {
        String branch;
        int sem;
        int roll;
        void setInfo(String name, int age,String branch,int sem,int roll)
        {
			setInfo(name,age);
			this.branch=branch;
			this.sem=sem;
			this.roll=roll;
		}

     void display()
       {
		  super.display();
		  System.out.println("Branch       :"+branch);
		  System.out.println("Semester     :"+sem);
		  System.out.println("Roll No      :"+roll);
       }

}
class  Inh3
{
    public static void main(String args[])
    {
       Student s = new Student();
       s.setInfo("Tejas",20,"CSE",7,58);
       s.display();

    }
}