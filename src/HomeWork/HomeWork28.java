package HomeWork;

public class HomeWork28 {
    public static void main(String[] args) {
        //Write a code with following requirements:
        //- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
        //- Print the minimum number in the given array

        int [] nums = new int[]{6,7,2,3,90,-2,-90,-122,96,35};
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if(min>nums[i]){
                min = nums[i];
            }
        }
        System.out.println(min+" is the minimum number in the arrays list");
    }
}
