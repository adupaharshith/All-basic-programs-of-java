import java.util.Scanner;
class reverse_order
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
long a=sc.nextInt();
while (a!=0)
{
long r=a%10;
{
System.out.print(r);
}
a=a/10;
}}}