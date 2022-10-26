/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by Prathibha on 10/26/22
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args ){
     System.out.println("Hey, Please enter your name here");
      Scanner input=new Scanner(System.in);
      String name=input.nextLine();
     if(name.equals("Alice")||name.equals("Bob"))
         System.out.println("Hey "+name+ "! How are you doing?");
     else
         System.out.print("Sorry, you are not welcomed here.");

    }
}
