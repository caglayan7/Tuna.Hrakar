package HomeWork;

import java.util.Scanner;

public class HomeWork20 {
    public static void main(String[] args) {
          /*
        Write a code where user is asked to enter a number.
        Find the sum of all the even numbers between 0 to that number (included)
        Find the sum of all the odd numbers between 0 to that number (included)
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1= scan.nextInt();
        int sum=0;
        for (int i = 0; i <=num1 ; i+=2) {

            if (i%2==0)
            {
                sum=sum+i;
                System.out.println("The even number is: "+i);
            }

        }

        int sum1=1;
        for (int j = 1; j <=num1 ; j+=2) {

            if (j%2==1)
            {
                sum1=sum1+j;
                System.out.println("The odd number is: "+j);
            }

        }
        System.out.println("Sum of even numbers is: "+sum);
        System.out.println("Sum of odd numbers is: "+sum1);
    }
}
