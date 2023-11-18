import java.util.Scanner;
class Queue
{
int f=-1,r=-1,n=5,i=0;
int q[]=new int[n];
void enque()
{
if (r==(n-1) && f>r)
{
System.out.println("Queue is overflow");
}
else
{
System.out.println("Enter an element");
int i=sc.nextInt();
if (r==-1 && f==-1)
{
f=0;
r=0;
q[r]=i;
System.out.println("Element is inserted");
}
else
{
r=r+1;
q[r]=i;
System.out.println("Element is inserted");
}
}
}
void dequeue()
{
if (r==-1 && f==-1)
{
System.out.println("Queue is empty");
}
else
{
f=f+1;
System.out.println("Element is deleted");
}
}
void peek()
{
if (r==-1 && f==-1)
{
System.out.println("Queue is empty");
}
else
{
System.out.println("peek value is"+q[f]);
}
}
void display()
{
for(int i=f;i<=r;i++)
System.out.println("elements are:"+q[i]);
}
}

class QueueArray
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  Queue o=new Queue();
  int z;
  do
  {
   System.out.println("1 is enque");
   System.out.println("2 is deque");
   System.out.println("3 is peek");
   System.out.println("4 is display");
   System.out.println("Enter ur choice");
   int y=sc.nextInt();
   switch(y)
   {
    case 1:
    {
     o.enque();
     break; 
    }
    case 2:
    {
     o.dequeue();
     break; 
    }
    case 3:
    {
     o.peek();
     break; 
    }
    case 4:
    {
     o.display();
     break; 
    }}
    System.out.println("Enter 0 to go back to main menu");
    System.out.println("Enter any key to exit");
    
    z=sc.nextInt();
    }while(z==0);
    System.out.println("Exit Successfully");
    }
}