package HomeWork;

import java.util.Arrays;

public class HomeWork34 {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index and put the the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}
        int nums[]  = {2,3,4,5,6,7,8,9};
        System.out.println("Our Elements before getting shifted "+ Arrays.toString(nums));
        for (int i = 0; i < nums.length-1; i++) {
        }
        int first = nums[0];
        for (int j = 0; j < nums.length-1; j++)
        {
            nums[j] = nums[j+1];
        }
        nums[nums.length-1]=first;
        System.out.println("The shifted Arrays:"+Arrays.toString(nums));
    }
}
