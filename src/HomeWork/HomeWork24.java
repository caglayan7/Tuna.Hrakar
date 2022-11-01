package HomeWork;

import java.util.Scanner;

public class HomeWork24 {
    public static void main(String[] args) {
           /* Write a code where user is being asked to enter a String and that checks if the String is Palindrome
PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
(Java, or Ziya or Cat are not palindrome)
(This is a bit hard question, It is an Interview question. Work on it we can solve it later on together) */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name= scan.nextLine();
        String reversed = "";
        for (int i =name.length()-1 ; i >= 0 ; i--) {
            reversed+=name.charAt(i);
            System.out.println(reversed);
        }

        boolean palindrome=true;
        for (int i = 0; i <name.length() ; i++) {

            if (name.charAt(i) != reversed.charAt(i)){
                palindrome=false;
            }

        }if (palindrome){

            System.out.println("This is a palindrome");
        }else
        {
            System.out.println("This is  not palindrome ");
        }
    }
}
