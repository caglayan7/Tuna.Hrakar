package HomeWork;
import java.lang.reflect.Array;
import java.util.Arrays;
public class HomeWork36 {
    public static void main(String[] args) {
        //Write a method where it takes array of integers and returns the sorted version of that array

        int [] a={10,5,78,98,74,-3,-20};
        System.out.println(Arrays.toString(sortArray(a)));
    }//end main
    public static int[] sortArray(int [] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a.length ; j++) {
                if (a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
       return a;
    }




}//end class
