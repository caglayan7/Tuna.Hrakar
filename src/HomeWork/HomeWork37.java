package HomeWork;

public class HomeWork37 {
    public static void main(String[] args) {
        //write a method where it takes 2 double values and 1 integer value.
        // When the integer value is 1 it returns to sum of the 2 double numbers,
        // when integer is 2 it returns the subtraction of those 2 double number,
        // when integer value is 3 it returns to the multiplication of those
        // 2 double numbers, and when the integer value is 4 it returns the division of those 2 double numbers

        System.out.println(calculator(5,10.0,2.0));


    }//end main
    public static double calculator (int options, double num1, double num2)
    {
        double result=0;

        if(options == 1){
            result=num1+num2;
        } else if (options == 2) {
           result=num1-num2;
        }else if (options == 3) {
             result= num1 * num2;
        }else if (options == 4) {
            result = num1 / num2;
        }
        return result;
    }



}
