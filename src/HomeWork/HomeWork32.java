package HomeWork;

import java.util.Scanner;

public class HomeWork32 {
    public static void main(String[] args) {
        ////Write   a     program   to   with following requirements
        //1) user should be prompted about how many numbers is going to be entered
        //2) User should be prompted for the values of the numbers
        //3) Reverse the all the given numbers and print it
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int number = scan.nextInt();
        int[] array= new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Please enter the "+(i+1)+". number: ");
            int num = scan.nextInt();
            array[i] = num;
        }

        int sum=0;
        for (int i = 0; i <array.length ; i++) {

            sum=sum+array[i];

        }

        System.out.println("the sum of all the number in the array is: "+sum);
        String reversed1 = " ";
        for (int l = array.length; l > 0 ; l--) {

            reversed1= String.valueOf(reversed1.charAt(l));
            l++;

        }
        System.out.println(" the value of the reversed: "+reversed1);
    }
}
