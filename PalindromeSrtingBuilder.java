import java.util.Scanner;
class PalindromeSrtingBuilder
{
public static void main(String args[])
{
/*String= a;*/
Scanner s=new Scanner(System.in);
String str = s.next();
StringBuilder sss=new StringBuilder(str);
sss.reverse();
String rev=new String(sss);
/*System.out.println(sss.reverse());*/
if (str.equals(rev))
{
System.out.println("palindrome");
}
else
{
System.out.println("Not a Palindrome");
}
}}