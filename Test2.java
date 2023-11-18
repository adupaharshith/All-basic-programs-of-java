/*import java.util.*;*/
class Test2{
public static void main(String args[]){
long a = 123498765;
int c=0;
while (a!=0){
long r=a%10;
c+=1;
a=a/10;
}
System.out.println(c);
}}
