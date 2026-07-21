import java.util.Scanner;
public class PerfectNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n <= 1) return;
    int sum = 1;
    
    int i = 2;
    while(i*i <= n) {
      if(n % i == 0) {
          sum += i;
          if(i != n/i){
              sum += n/i;
          }
      }
      i++;
    }
    System.out.println(sum == n);
  }
}
