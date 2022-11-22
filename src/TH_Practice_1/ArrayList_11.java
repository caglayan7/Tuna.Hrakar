package TH_Practice_1;

import java.util.ArrayList;

public class ArrayList_11 {
    public static void main(String[] args) {
        ArrayList<Integer> MyInt = new ArrayList<Integer>();

        MyInt.add(44);
        MyInt.add(33);
        MyInt.add(12);
        MyInt.add(22);
        MyInt.add(54);
        MyInt.add(123);

        int myelement = MyInt.get(3);
        System.out.println(myelement);
        Myline();
        MyInt.add(0,10);
        System.out.println(MyInt);
        Myline();
        MyInt.set(2,35);
        System.out.println(MyInt);
        Myline();
        MyInt.remove(6);
        System.out.println(MyInt);
        Myline();

        int sum = 0;
        for (int i = 0; i < MyInt.size(); i++) {
           sum += MyInt.get(i);

        }
        System.out.println(sum);
    }
    public static void Myline(){
        System.out.println("____________________________________________________");
    }
}
