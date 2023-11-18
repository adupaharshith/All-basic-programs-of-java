import java.util.Scanner;
class Stack
{
 int top=-1;
 int n=5;
 int a[]=new int[n];
 void push()
 {
  if (top==(n-1))
  {
   System.out.println("Stack is overflow");
  }
  else 
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter an element:");
   int x=sc.nextInt();
   top=top+1;
   a[top]=x;
   System.out.println("Element is inserted:");
  }
 }
 void pop()
 {
  if (top==(top-1))
  {
   System.out.println("Stack is underflow");
  }
  else 
  {
   top=top-1;
   System.out.println("Element is deleted:");
  }
 }
 void peek()
 {
  if (top==(top-1))
  {
   System.out.println("Stack is empty");
  }
  else
 {
  System.out.println("peek value is:"+a[top]);
 }
 }
 void display()
 {
  for(int i=top;i>=0;i--)
  System.out.println(a[i]);
 }
}
class ClassArray
{
 public static void main(String args[])
 {
  Scanner sc = new Scanner(System.in);
  Stack o=new Stack();
  int z;
  do
  {
   System.out.println("1 is push");
   System.out.println("2 is pop");
   System.out.println("3 is peek");
   System.out.println("4 is display");
   System.out.println("Enter ur choice");
   int y=sc.nextInt();
   switch(y)
   {
    case 1:
    {
     o.push();
     break; 
    }
    case 2:
    {
     o.pop();
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
    System.out.println("Enter any key to exit other than 0");
    
    z=sc.nextInt();
    }while(z==0);
    System.out.println("Exit Successfully");
    }
}