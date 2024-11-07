import java.util.Scanner;
 class maths{
  void area(int base,int height){
    System.out.println("The area of triangle is "+base*height);
  } void area(double length,double breadth){
    System.out.println("The area of rectangle is "+length*breadth);
  }   void area(double r){
    System.out.println("The area of circle is "+3.14*r*r);
  }
} public class MethodOverLoading{
    public static void main(String [] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the value of base and height");
         int base=sc.nextInt();
         int height=sc.nextInt();
         System.out.println("Enter the value of length and breadth");
         double length =sc.nextDouble();
         double breadth=sc.nextDouble();
         System.out.println("Enter the radius of the circle");
         double radi=sc.nextDouble();
         maths math=new maths();
         math.area(base, height);
         math.area(length,breadth);
         math.area(radi);
    }    
}
