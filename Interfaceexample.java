import java.util.Scanner;
interface human{
    final int jobid=1080;
    void work();
    void learn(String str);
} interface Recruitment{
    void screening(int score);
} class programmer implements human,Recruitment{
   public void learn(String str){
   System.out.println("The trained area is "+str);
} public void screening(int score){
    System.out.println(" your test is score "+score);
}
 public void work(){
System.out.println("the role is senoir developer");
}
} public class Interfaceexample{
    public static void main(String args []){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your trained area ");
        String str=sc.nextLine();
        System.out.println("Enter your test score ");
        int score=sc.nextInt();
        System.out.println("*****ABOUT MY PLACEMENT****");
        programmer p=new programmer();
        p.learn(str);
        p.screening(score);
        p.work(); 
        sc.close();
    }
    }
 
