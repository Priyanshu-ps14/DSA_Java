package Maths;
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int original_num = num;
        int sum = 0;
        int rem;


        while(num != 0) {
            rem = num%10;
            num /= 10;
            sum = sum + rem*rem*rem;

        }
        if (sum == original_num) {
            System.out.println("The number is armstrong.");
        }
        else {
            System.out.println("The number is not armstrong.");
        }

    }


}
