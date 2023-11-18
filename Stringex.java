import java.util.Scanner;
class stringex
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a string");
int i=1;
while (sc.hasNext()!=true){
String a=sc.nextLine();
i++;

System.out.println(i+" "+a);
}
}
}
