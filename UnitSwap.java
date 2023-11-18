import java.util.Scanner;
class UnitSwap {

public static void main(String args[]){
int x,y,a,b,c,d,r1,r2;
Scanner sc=new Scanner(System.in);
x=sc.nextInt();
y=sc.nextInt();
a=x%10;
b=y%10;
c=x/10;
d=y/10;
r1=c*10+b;
r2=d*10+a;
System.out.println(r1+" "+r2);
}}