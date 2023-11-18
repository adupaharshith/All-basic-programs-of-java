import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner cc=new Scanner(System.in);
	System.out.println("Enter the number of elements to sort");
	int n=cc.nextInt();
	System.out.println("please enter "+n+" elements only");
	int a[]=new int[n];
	for(int i=0;i<a.length;i++)
	{
		a[i]=cc.nextInt();
	}
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if (a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("After Sorting: ");
	for(int s=0;s<a.length;s++)
	
		System.out.print(a[s]+" ");
	
	

}
}
