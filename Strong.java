import java.util.Scanner;
public class Strong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int num=a;
		int sum=0;
		while (a!=0)
		{	
			int fact=1;
			int b=a%10;
			for(int i=1;i<=b;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			a=a/10;
		}
		if (num==sum)
		{
			System.out.println("strong");
		}
		else
		{
			System.out.println("Not strong");
		}
	}
}
