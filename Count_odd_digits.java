import java.util.Scanner;
public class Count_odd_digits {
  public static void main(String[] args) {
    int count = 0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(n > 0) {
        int digit = n % 10;
        if(digit % 2 == 1) {
            count++;
        }
        n /= 10;
    }

    System.out.println(count);

  }
  
}
