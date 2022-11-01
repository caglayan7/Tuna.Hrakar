package HomeWork;

import java.util.Scanner;

public class HomeWork25 {
    public static void main(String[] args) {
              /*
Write a code where the user is asked to enter an integer number
- sum of all the odd numbers between 1 to given number (included) but exclude the 9,11,23,35 from
-the total sum if those numbers happen to be in the range of 1 to the given number.

               */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a integer number :");
        int number = scan.nextInt();
        int result = 0;
        int i = 0;
        while (i <= number) {
            if (i % 2 == 1) { //number is odd
                if (i == 9 || i == 11 || i == 23 || i == 35) {
                    i++;
                    continue;
                }
                result = result + i;
            }
            i++;
        }
        System.out.println("Sum :" + result);

    }
    }

