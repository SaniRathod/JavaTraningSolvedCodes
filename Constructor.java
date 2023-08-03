class Firm
{
    String name;
   // int regno;

Firm()
{
   name="JCOET";
  // regno="443";

}
void display()
{
    System.out.print("Name="+name);

}
}
class Constructor
{
public static void main(String args[])
{
    Firm f=new Firm();
    f.display();
}
}
