import java.util.Scanner;
public class CountOfPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 1) {
            return;
        }
        int count = 0;
        for(int i = 2;i <= n;i++) {
            if(isPrime(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isPrime(int n) {
        for(int i = 2;i*i <= n;i++) {
            if(n % i == 0) {
                return false;
            } 
        }
        return true;
    }
}
