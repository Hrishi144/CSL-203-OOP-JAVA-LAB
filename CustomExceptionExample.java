import java.util.*;
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
} public class CustomExceptionExample{
    public static validateAge(int age) throws Exception{
        if(age<18){
            throw new AgeException("Must be 18");
        }
        System.out.println("Age is valid ");
    }
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        try{
            validateAge(age);
        }catch(AgeException e){
            System.out.println("Error "+e.getMessage());
        }
    }
}
    

