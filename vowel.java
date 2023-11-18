import java.util.Scanner;
class vowel
{
public static void main(String args[])
{
Scanner m=new Scanner(System.in);
System.out.println("Enter a character:");
char c=m.next().charAt(0);
switch(c)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
System.out.println("vowel");
break;
default:
System.out.println("consonant");
break;
}}}
