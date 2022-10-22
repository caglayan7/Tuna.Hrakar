package TH_Practice_1;

import java.util.Scanner;

public class Day1_ForLoops {
    public static void main(String[] args) {
        //Print even numbers between two giving numbers by users using scanner

        Scanner scan = new Scanner(System.in);

        System.out.println("first number");
        int num1 = scan.nextInt();
        System.out.println("second number");
        int num2 = scan.nextInt();
        int first;
        int second ;
        if(num1>num2){
            first= num2;
            second= num1;
        }else {
            first=num1;
            second=num2;
        }
        int sum = 1;
        for (int i = first; i < second; i++) {

            if(i%2==0){
                sum=sum+i;
            }


        }
        System.out.println("First: "+first+" second : "+second+" sum : "+sum);

    }
}
