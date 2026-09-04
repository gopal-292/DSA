// package Basics.Recursion;

public class Prime {
    public static void main(String[] args) {
        int num = 29;
        if(num <= 1) {
            System.out.println(false);
        }
        System.out.println(isPrime(2,num));
    }
    private static boolean isPrime(int i,int n){
        
        if(i > Math.sqrt(n)) {
            return true;
        }
        return (n % i != 0) && isPrime(i+1,n);
    }
}
