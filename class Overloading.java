class Sample
{
  int x,y,z;

void setData()
{
    x=1;y=2;y=3;
}
void setData(int v)
{
    x=y=z=v;
}
void setData(int a,int b,int c)
{
    x=a;
    y=b;
    z=c;
}
void display()
{
    System.out.println("x="+x+"y="+y+"z="+z);
}
}
class  Overloading3
{
    public static void main(String args[])
    {
       Sample s1,s2,s3;
       s1=new Sample();
       s2=new Sample();
       s3=new Sample();

       s1.setData();
       s2.setData(54);
       s3.setData(43,54,76);

       s1.display();
       s2.display();
       s3.display();
    }
}