package HomeWork;

import java.util.Arrays;

public class HomeWork38 {
    public static void main(String[] args) {
        //Write a method where it takes 2 integer arrays as parameters,
        // and returns to the an integer array
        // where it includes 2 highest different values in the first array and 2 lowest different
        // values in the second array.

        int[] array1 = {2, 3, 4, 5, 6, 9, 67};
        int[] array2 = {55, 34, 35, 446, 49, 667};
        twoHighestNums(array1);
        twoHighestNums(array2);
        twoLowestNums(array1);
        twoLowestNums(array2);
    }

    public static void twoHighestNums(int[] param1) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int number : param1) {
            if (number > max1) {
                max2 = max1;
                max1 = number;
            } else if (number > max2) {
                max2 = number;
            }
        }
        System.out.println("First Highest number: " + max1);
        System.out.println("Second Highest number: " + max2);


    }

    public static void twoLowestNums(int[] param1) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int number : param1) {
            if (number < min1) {
                min2 = min1;
                min1 = number;
            } else if (number < min2) {
                min2 = number;
            }
        }
        System.out.println("First Lowest number: " + min1);
        System.out.println("Second Lowest number: " + min2);

    }
}

