package HomeWork;

import java.util.Scanner;

public class HomeWork23 {
    public static void main(String[] args) {
          /* Write a program where the user is being asked to enter a String and that   will   count   how   many   times
        "a" or 'A'   is   found   in that entered String
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a String");
        String name= scan.next();

        int count=0;

        for (int i = 0; i <name.length() ; i++) {
            if (name.charAt(i)=='a' || name.charAt(i)=='A'){

                count++;

            }


        }
        System.out.println("The String contain: "+count);
    }
}
