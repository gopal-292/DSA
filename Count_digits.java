import java.util.Scanner;
class Count_digits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    if(n == 0) {
      System.out.println(1);
    }
    while(n > 0) {
      count++;
      n /= 10;
    }
    System.out.println(count);

    System.out.println((int)Math.floor(Math.log10(n) + 1));
  }
  
}