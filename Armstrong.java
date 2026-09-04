import java.util.Scanner;
public class Armstrong {
  public static void main(String[] args) {
    //An armstrong number is a number which is equal to the sum of the digits of the number, raised to the power of the number of digits.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n == 0) return;
    int digits = 0;
    int sum = 0;
    int temp = n;
    while(temp > 0) {
        digits++;
        temp /= 10;
    }
    temp = n;
    while(temp > 0) {
        sum += Math.pow(temp%10,digits);
        temp /= 10;
    }
    System.out.println(sum == n);

  }
}