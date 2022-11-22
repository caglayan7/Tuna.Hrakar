package HomeWork;

public class HomeWork42 {
    public static void main(String[] args) {
        /*
        Write a method where it takes a String and returns to a String by adding "Not" in front
        of the String only if It does not have "Not" in front of it already.
 For example :
 notString("Car" ) == > "Not Car"
 notString("Home"). ==> "Not Home"
 notString("Not Home") == > "Not Home"
         */
        System.out.println("Adding() = " + Adding("NotCar"));

    }
    public static String Adding (String param1){
        if (param1.contains("Not")){
            return param1;
        } else {
            return "Not"+param1;
        }
    }
}
