package Basics;
import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "! Welcome to Java programming.");
        System.out.print("Enter your age: ");
        int Age = sc.nextInt();
        System.out.println("You are " + Age + " years old.");

    }

}
