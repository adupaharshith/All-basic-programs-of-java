import java.util.Scanner;
class A
{
public static void main(String args[])
{
Scanner c=new Scanner(System.in);
System.out.println("Enter a alphabet");
char a=c.next().charAt(0);
if (a>=65&&a<=90){
a=(char)(a+32);}
if (a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
{
System.out.println("ovwel");
}
else
{
System.out.println("consonant");
}}
}