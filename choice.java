import java.util.Scanner;
class choice
{
public static void main(String args[])
{
Scanner m=new Scanner(System.in);
System.out.println("Enter a value:");
int a=m.nextInt();
System.out.println("Enter b value:");
int b=m.nextInt();
System.out.println("Enter ur choice:");
int c=m.nextInt();
switch(c)
{
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a*b);
break;
case 4:
System.out.println(a/b);
break;
default:
System.out.println("warning enter the number between one to four");
break;
}
}
}