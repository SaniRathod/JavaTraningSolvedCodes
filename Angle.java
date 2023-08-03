import java.io.*;
class Angle
{
public static void main(String args[]) throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter the Angles :");
int a=Integer.parseInt(br.readLine());
int b=Integer.parseInt(br.readLine());
int c=Integer.parseInt(br.readLine());
if(a+b+c==180)
{
System.out.println("It is valid");
}
else
{
System.out.println("It is not valid");
}
}
}