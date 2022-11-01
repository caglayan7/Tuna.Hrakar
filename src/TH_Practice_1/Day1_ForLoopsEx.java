package TH_Practice_1;

public class Day1_ForLoopsEx {
    public static void main(String[] args) {
        // write a code where you find the even numbers between 10 - 120(not included)
        int count = 0;
        //int coun2 = 0;
        for (int i = 10; i < 120; i+=2) {
            count++;

        }
        System.out.println(count);
    }
}
