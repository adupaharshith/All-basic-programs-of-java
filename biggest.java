import java.util.Scanner;
class biggest
{
public static void main(String args[])
{
Scanner m=new Scanner(System.in);
System.out.println("Enter a value:");
int a=m.nextInt();
System.out.println("Enter b value:");
int b=m.nextInt();
System.out.println("Enter c value:");
int c=m.nextInt();
if (a>b)
{
if (a>c)
{
System.out.println("The biggest number among 3 are :"+a);
}
else
{
System.out.println("The biggest number among 3 are :"+c);
}
}
else
{
if (b>a)
{
if (b>c)
{
System.out.println("The biggest number among 3 are :"+b);
}
else
{
System.out.println("The biggest number among 3 are :"+c);
}
}
}
}
}