package HomeWork;

public class HomeWork35 {
    public static void main(String[] args) {
//Write a method where it takes 2 strings as
// a parameter and returns true when 2 strings are equal and returns false when they are not equal.

        System.out.println( ifEqualToo("Hrakar", "Hrakar"));
        System.out.println( ifEqualToo("Hrakar", "HrakAr"));

    }//end main

    public static boolean ifEqualToo(String a, String b){

        if(a == b){
            return true;
        } else
            return false;



    }




}//end class
