import java.util.Scanner;
class perfect{

public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int c=0;
for (int i=1;i<a;i++)
{
if (a%i==0)
{
c+=i;
}
}
if (a==c)
{
System.out.println("Perfect");
}else
{
System.out.println("not Perfect");
}
}}