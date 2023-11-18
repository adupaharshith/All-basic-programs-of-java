import java.util.Scanner;
class sum_n_nat_num
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
int b=0;
for(int i=1;i<=a;i++)
b=b+i;
System.out.println(b);
}
}