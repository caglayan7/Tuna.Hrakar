package HomeWork;

import java.util.Scanner;

public class HomeWork27 {
    public static void main(String[] args) {
        /*
        Write a code which asks user to enter a String and removes all the duplicate characters from the String and prints the result
        ex. "AAAAAVVVCCDDAA" ==> "AVCD"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String: ");
        String characters = scan.nextLine();
        String result = "";

        for (int i = 0; i < characters.length(); i++) {
            if (!result.contains(String.valueOf(characters.charAt(i)))) {
                result += String.valueOf(characters.charAt(i));
            }
        }
        System.out.println("the value of the result: "+result);
    }
}
