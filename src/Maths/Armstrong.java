package Maths;


public class Armstrong {
    public static void main(String[] args) {


        for (int i = 100; i <= 1000; i++) {
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int num) {

        int original_num = num;
        int sum = 0;
        int rem;


        while (num != 0) {
            rem = num % 10;
            num /= 10;
            sum = sum + rem * rem * rem;
        }
        return sum == original_num;
    }
}
