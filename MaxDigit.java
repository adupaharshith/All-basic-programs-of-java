import java.util.Scanner;
class MaxDigit
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
long a=s.nextLong();
long c=0;
while (a!=0)
{
/*long c=0;*/
long r=a%10;
if (r>c)
{
c=r;
}
a=a/10;
}
System.out.println(c);
}}