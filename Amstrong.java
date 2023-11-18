import java.util.Scanner;
class Amstrong{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int num=a;
int sum=0;
while (a!=0)
{
int r=a%10;
sum=sum+r*r*r;
a=a/10;
}
if (sum==num)
{
System.out.println("Amstrong");
}
else{
System.out.println("Not an Amstrong");
}
}}
