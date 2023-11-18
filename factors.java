import java.util.Scanner;
class factors
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
int b=0;
for(int i=1;i<=a;i++)
{
if (a%i==0)
{
b=b+1;
System.out.println(i);
}
}
System.out.println("count="+b);
}
}
