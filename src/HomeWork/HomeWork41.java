package HomeWork;

public class HomeWork41 {
    public static void main(String[] args) {
        /*
        We have two monkeys,   MonkeyA   and MonkeyB.
We are in trouble if they are both smiling or if neither of them is smiling.   Return true if we are in
trouble.
Please create a Class named MonkeyClass. It will have a boolean Field called IsSmiling.
Please create 2 copy of MonkeyClass and name them MonkeyA and MonkeyB.
Please create a method that takes 2 booleans. Returns a boolean.
Name your method as monkeyTrouble.
Your will pass MonkeyA.IsSmiling and MonkeyB.IsSmiling to your
 method and you should get below results based on if they are smiling or not.
monkeyTrouble(true,   true)   →   true
monkeyTrouble(false,   false)   →   true
monkeyTrouble(true,   false)   →   false
monkeyTrouble(false,   true)   →   false
         */
        MonkeyClass MonkeyA = new MonkeyClass();

        MonkeyClass MonkeyB = new MonkeyClass();
        MonkeyA.IsSmiling = true;
        MonkeyB.IsSmiling= true;
        System.out.println(monkeyTrouble(MonkeyA.IsSmiling,MonkeyB.IsSmiling));
    }
    public static boolean monkeyTrouble(boolean a, boolean b){
        boolean c = false;
        if(a == true && b == true){
           return c= true;
        } else if (a == false && b == false) {
            return c = true;
        } else if (a == true && b == false) {
            return c = false;
        } else if (a == false && b == true) {
            return c = false;
        }
        return c;
    }
}

class MonkeyClass{
    public boolean IsSmiling;
}