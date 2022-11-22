package TH_Practice_1;

import java.util.ArrayList;

import static TH_Practice_1.Prac_Class.Myline;

public class New {
    public static void main(String[] args) {
        ArrayList<Integer> TunaFish = new ArrayList<Integer>();
        TunaFish.add(10);
        TunaFish.add(8);
        TunaFish.add(10);
        TunaFish.add(8);
        TunaFish.add(8);
        TunaFish.add(4);
        int num = TunaFish.size();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += TunaFish.get(i);
        }
        System.out.println("sum " + sum);
        int mean = sum / num;
        System.out.println("mean= " + mean);


        ArrayList<Integer> VarianceTunaFish = new ArrayList<Integer>();
        // 10 8 10 8 8 4  tuna fish
        // all the numbers / 6 = 8          mean =8
        // 2  0 2  0 0 -4
        //

        for (int i = 0; i < num; i++) {
            VarianceTunaFish.add(TunaFish.get(i) - mean);
        }
        System.out.println(VarianceTunaFish);

        ArrayList<Integer> SquareOfVarianceTunaFish = new ArrayList<Integer>();

        for (int i = 0; i < num; i++) {
          int sqr = (VarianceTunaFish.get(i)) * VarianceTunaFish.get(i);
            SquareOfVarianceTunaFish.add(sqr);
        }
        System.out.println(SquareOfVarianceTunaFish);
        
        double sumofSquareOfVarianceTunaFish = 0;
        for (int i = 0; i < num; i++) {
            sumofSquareOfVarianceTunaFish+=SquareOfVarianceTunaFish.get(i);
        }
        System.out.println(sumofSquareOfVarianceTunaFish);

        double variance = sumofSquareOfVarianceTunaFish/(num-1);
        System.out.println(variance);

        double squareRootOfVariance = Math.sqrt(variance);
        System.out.println(squareRootOfVariance);
        Myline();

    }
}

