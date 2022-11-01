package HomeWork;

import java.util.Scanner;

public class HomeWork26 {
    public static void main(String[] args) {
             /*
        Write a code where it ask user to enter an integer number
- Reverse the given number and print the result
- Example input ( 5678 )
- Example output ( 8765 )
         */
        Scanner scan=new Scanner(System.in);
        String name= scan.nextLine();
        String reversed = "";
        for (int i =name.length()-1 ; i >= 0 ; i--) {
            reversed+=name.charAt(i);

        }
        System.out.println("The Result is: "+reversed);
    }
}
