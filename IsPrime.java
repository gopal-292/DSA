import java.util.*;
public class IsPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
     if(n <= 1) return;
    double limit = Math.sqrt(n);
    
    for(int i = 2;i <= limit;i++) {
      if(n % i == 0) {
        System.out.println("Not a prime number");
        return;
      }
    }
    System.out.println("Prime Number");
  }
}
