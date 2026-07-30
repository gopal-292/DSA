// package Basics.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fib(n));
    }
    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }
        return fib(n-2) + fib(n-1);
    }
}
