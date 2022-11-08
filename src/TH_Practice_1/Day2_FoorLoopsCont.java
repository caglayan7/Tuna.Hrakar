package TH_Practice_1;

import java.util.Scanner;

public class Day2_FoorLoopsCont {
    public static void main(String[] args) {
        // write a code where you calculate the sum of all the integer numbers between 0 to 20;
//        int result = 0;
//        for(int j = 0 ;j<20;j++){
//
//            result = result+j; // result = 0 + 0 = 0
//            //                                // result = 0+1 = 1
//            //                                // result = 1+2 = 3
//            //                                // result = 3+ 3= 6;
//            //                                // result = 6+4= 10
//            //                                // result = 0+1+2+3+4+5
//            //System.out.println("the result for each iteration: "+result);
//
//        }
//        System.out.println("The END result is: "+result);


        //ask the user to enter two numbers and sum + all the integers between the two numbers.

        Scanner scan = new Scanner(System.in);

        System.out.println("first number:");
        int num1 = scan.nextInt();
        System.out.println("sencond number: ");
        int num2 = scan.nextInt();

        int sum=0;

        for (int i = num1; i < num2 ; i++) {
            sum=sum+i;
        }
        System.out.println(sum);

    }//end main





}//end class
