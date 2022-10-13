package Baynosacsit;
import java.util.Scanner;
public class csit {

  public static void main(String[] args) {
   
   Scanner mc= new Scanner(System.in);

        System.out.println("Enter input String with Symbol: ");
   newcsit stack = new newcsit(mc.nextLine());
        stack.Search();
        stack.Print();
          
  }
}
