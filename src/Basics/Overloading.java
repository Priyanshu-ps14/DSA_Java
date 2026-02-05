package Basics;

public class Overloading {

    public static void main(String[] args) {
        fun("Maddy");
        fun(50);
        fun(60, "Hero");
        fun(70,20,10);
    }


// Functions having same names but different types of arguments, OR
// Functions having same name and same type of arguments but different number of arguments.


    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int a,int b,int c){
        System.out.println(a+b+c);
    }

    static void fun(String Myname) {
        System.out.println(Myname);
    }

    static void fun(int a, String Myname) {
        System.out.println(a + " " + Myname);
    }
}
