import java.util.*;
class Anagram {
public static void main(String args[]){
//int check(string s)
Scanner sc = new Scanner(System.in);
String s1=sc.next();
String s2=sc.next();
s1=s1.replaceAll("//s","").toLowerCase();
s2=s2.replaceAll("//s","").toLowerCase();
if (s1.length()==s2.length())
{
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
if (Arrays.equals(ch1,ch2))
{
System.out.println("Anagram");
}
else
{
System.out.println("Not an anagram");
}
}
else
{
System.out.println("Not an anagram");
}
}
}