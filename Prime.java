import java.util.Scanner;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
int b=0;
for(int i=2;i<a/2;i++)
{
if (a%i==0)
{
b=1;
}
}
if (b==0) 
System.out.println("Prime");
else
System.out.println("Not Prime");
}
}
