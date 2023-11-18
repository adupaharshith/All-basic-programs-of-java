import java.util.Scanner;
class leap
{
public static void main(String args[])
{
Scanner m=new Scanner(System.in);
System.out.println("Enter an year:");
int c=m.nextInt();
if ((c%100!=0 && c%4==0) || (c%400==0))
{
System.out.println("leap year");
}
else
{
System.out.println("not a leap year");
}
}
}