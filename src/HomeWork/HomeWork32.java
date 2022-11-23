package HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork32 {
    public static void main(String[] args) {
        ////Write   a     program   to   with following requirements
        //1) user should be prompted about how many numbers is going to be entered
        //2) User should be prompted for the values of the numbers
        //3) Reverse the all the given numbers and print it
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter of array size: ");
        int number = scan.nextInt();
        int[] array= new int[number];

        for (int i = 0; i < number; i++) {
            System.out.println("Please enter the "+(i+1)+". number: ");
            int num = scan.nextInt();
            array[i] = num;
        }
        int [] reversedArray = new int[number];
                int reversed = 0;
                for (int i=array.length-1; i>=0; i--){
                    reversedArray[i] = array[reversed];
                    reversed++;
                }
                System.out.println("Original array: "+Arrays.toString(array));
                System.out.println("Reversed Array: "+ Arrays.toString(reversedArray));
        }
    }

