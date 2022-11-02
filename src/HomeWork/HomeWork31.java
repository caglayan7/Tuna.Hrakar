package HomeWork;

import java.util.Scanner;

public class HomeWork31 {
    public static void main(String[] args) {
        //Write   a   program   that   creates   an   array   of   10   elements   size.
        // Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then   display   the   sum   of   all
        //array   elements. ( we already did this in the class but try to do it again)

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter size of the elements: ");
        int element = scan.nextInt();
        double [] num1 = new double[element];

        for (int i = 0; i < element; i++) {
            System.out.println("Please enter the " +(i+1) + ". number: ");
            double num = scan.nextDouble();
            num1[i]=num;

        }
        double sum = 0;
        for (int i = 0; i < num1.length; i++) {

            sum = sum + num1[i];
        }
        System.out.println("The sum of all the numbers in the array is: " + sum);

    }
}
