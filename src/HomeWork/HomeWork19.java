package HomeWork;

import java.util.Scanner;

public class HomeWork19 {
    public static void main(String[] args) {
        // Write a code where user is asked to enter a number and check for every number
        // between 0 to that number to see how many numbers between 0 to that number
        // can be divided to 3 and 5 and  sum all those numbers, Print the result

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= num1; i++) {

            if (i % 3 == 0 && i % 5 == 0) {

                sum = sum + i;
                System.out.println("Can be,divided 3 and 5: " + i);

            }

        }
        System.out.println("The sum value is: " + sum);
    }
}
