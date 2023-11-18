import java.util.Scanner;
class Fibo
{
public static void main(String args[])
{
int a=0,b=1,c;
Scanner d=new Scanner(System.in);
int n=d.nextInt();
System.out.print(a+" "+b+" ");
for(int i=3;i<=n;i++)
{
c=a+b;
System.out.print(c+" ");
a=b;
b=c;
}
}}