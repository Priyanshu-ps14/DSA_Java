package Basics;
import  java.util.Scanner;


public class Functions_Methods {
    public static void main(String[] args) {
        sum();
        sum();
        sum();
    }
    static void sum(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter num 3: ");
        int num3 = sc.nextInt();
        int sum = num1+num2+num3;

        System.out.println("Sum of numbers is: "+ sum);
    }
}
