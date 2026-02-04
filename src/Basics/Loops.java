package Basics;


public class Loops {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 2; i<=20; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i = 2;i<=10; i++){
            for (int j=1;j<=10;j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }
        }
         System.out.println();
    }
}
