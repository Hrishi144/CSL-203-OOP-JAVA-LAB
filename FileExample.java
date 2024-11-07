//java program
import java.util.*;
import java.io.*;
public class FileExample{
    public static void main(String args []){
        try{
            Scanner sc=new Scanner (System.in);
            File obj=new File("register1.txt");
            obj.createNewFile();
            System.out.println("File is created");
            FileWriter fout=new FileWriter("register1.txt");
            System.out.println("Enter your keam rank");
            int n=sc.nextInt();
            fout.write(n+"\n");
            fout.close();
            System.out.println("Data Added");
            FileReader fin =new FileReader("register1.txt");
            BufferedReader br=new BufferedReader(fin);
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
                sc.close();
            }br.close();

        } catch(IOException e){
            System.out.println("An Exception occured "+e.getMessage());

        }
    }
}