// "New" means new compared to previous level
import java.util.Scanner;

public class NumberSearch {
   public static void findNumber(int targetNum, int lowVal, int highVal, String indentAmt) {
      int midVal;

      midVal = (highVal + lowVal) / 2;
      System.out.print(indentAmt + midVal + "?");

      if (targetNum == midVal) {
         System.out.println(" found");
      }
      else { // New: Both cases below changed
         if (targetNum < midVal) {
            System.out.println(" lower");
         }
         else {
            System.out.println(" higher");
         }
      }

      System.out.println(indentAmt + "back");
   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int targetNum;

      targetNum = scnr.nextInt();
      findNumber(targetNum, 0, 6, "");
   }
}