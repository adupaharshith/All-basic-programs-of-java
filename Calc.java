class Cal
{
 void findArea(){
 int h=4,b=8;
 {
  System.out.println("Area of triangle:"+(0.5*h*b));
 }
 }
 void findArea(int s)
 {
  System.out.println("Area of Square:"+(s*s*s));
 }
 void findArea(float l,float b)
 {
  System.out.println("Area of Rectangle:"+(l*b));
 }
 void findArea(double r)
 {
  System.out.println("Area of Cricle:"+(r*r));
 }
 public static void main(String args[])
  {
   Cal o1=new Cal();
   o1.findArea();
   Cal o2=new Cal();
   o2.findArea(4);
   Cal o3=new Cal();
   o3.findArea(2.4f,6.6f);
   Cal o4=new Cal();
   o4.findArea(4.789);
  }
}
