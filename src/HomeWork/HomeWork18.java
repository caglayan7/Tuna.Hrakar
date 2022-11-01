package HomeWork;

import java.util.Scanner;

public class HomeWork18 {
    public static void main(String[] args) {
               /*Write a code where user is asked to enter an integer number:
Using the given number find the factorial of that number and Print the result.
example: 5 ==> 5! = 5*4*3*2*1 = 120 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Tuna enter any numbers: ");
        int func = scan.nextInt();
        int hra=1; // this is the starting point for the factorial
        for (int i = 1; i <= func ; i++) {
            hra= hra*i;
        }
        System.out.println("The factorial result is: "+hra);

    }
}
