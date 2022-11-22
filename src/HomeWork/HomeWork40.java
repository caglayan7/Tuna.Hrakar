package HomeWork;

public class HomeWork40 {
    public static void main(String[] args) {
        /*
        Write a method that takes the day as an integer such as (1 for Monday, 2 for Tuesday, and so on)
         and it returns a String value indicating "Go To Work" for weekdays and "Go Back to Sleep" weekends.

Please create a method that takes one integer parameter and returning a String.
Name your Method as (GotoSleeporWork)
Based on your parameter, if you are in weekdays, return "Go To Work" otherwise return "Go Back to Sleep".
         */
        System.out.println(days(5));

    }
    public static String days (int param1) {

        if (param1 <= 5) {
            return "Go To Work";
        } else if (param1 >= 6 || param1 <= 7) {
            return "Go Back To Sleep";
        } else
            return "Invalid Number";
    }
}
