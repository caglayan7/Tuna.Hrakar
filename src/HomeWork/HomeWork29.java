package HomeWork;

public class HomeWork29 {
    public static void main(String[] args) {
        //write a code with following requirements
        //- define an array with following values {90,34,23,87,45,36,98}
        //- Print the values that can be divided by 2 or 3

        int[] num1 = {90,34,23,87,45,36,98};


        for (int i = 0; i < num1.length; i++) {
            if(num1[i]%2 == 0 || num1[i]%3 == 0){
                System.out.println(num1[i]+" Can be devided by 2 or 3.");
            }

        }

    }
}
