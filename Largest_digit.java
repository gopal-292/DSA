import java.util.Scanner;

public class Largest_digit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int largest = 0;
    if(n == 0) return;
    while(n > 0) {
        int digit = n % 10;
        if(digit > largest) largest = digit;
        n /= 10;
    }
    System.out.println(largest); 
  }
}
