import java.util.Scanner;
public class Palindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if(n < 0) {
      System.out.println(false);
      return;
    } 
    System.out.println(n == rev(n));

  }
  static int rev(int n) {
        int reversed = 0;
        while(n > 0) {
            reversed = (reversed * 10) + (n % 10);
            n /= 10;
        }
        return reversed;
    }
}
