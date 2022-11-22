package TH_Practice_1;

import java.util.Scanner;

public class Prac_Class {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Myline();

        School Tuna = new School();
        String schoolName = Tuna.SchoolName;


    }
    public static void Myline(){
        System.out.println("_________________________________________________________________");
    }
}
class School{
   static String SchoolName = "RenasTech";
   String Name;
   String LNamel;
   String Gender;
   int Class;
   int Age;





}
