package HomeWork;

import java.util.Scanner;

public class HomeWork33 {
    public static void main(String[] args) {
        //Write a code where user is asked to enter for 5 employee salaries and store those salaries
        //Then find the average salary of those 5 employees
        Scanner scan = new Scanner(System.in);

        System.out.println("Please Enter the Quantity of Employees Salaries");
        String str = scan.nextLine();
        int size = 5;
        double [] salaries = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the salary of "+(i+1)+ " the employee: ");
            salaries[i] = scan.nextDouble();
        }
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += salaries[i];
        }
        System.out.println("The average employee salary: "+sum/size);


    }
}
