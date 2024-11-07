import java.util.*;
public class StringTokenExample {
  public static void main(String args []){
    int n,sum=0;
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter an integer with one space gap");
    String st=sc.nextLine();
    StringTokenizer str=new StringTokenizer(st ," ");
    while(str.hasMoreTokens()){
      String a=str.nextToken();
      n=Integer.parseInt(a);
      System.out.println(a);
      sum+=n;
    }
    System.out.println("The sum of integers = "+sum);
    sc.close();
}
}