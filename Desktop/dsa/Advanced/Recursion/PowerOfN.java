package Advanced.Recursion;
class PowerOfN {
    public static void main(String[] args) {
        int n = 10;
        double x = 2;
        if(n == 0) {
            System.out.println(1);
            return;
        }
        long num = n;
        if(num < 0) {
            x = 1 / x;
            num = -1 * num;
        }
        System.out.println(pow(x,num));
    }
    static double pow(double x,long n) {
        if(n == 1) {
            return x;
        }
        if(n % 2 != 0) {
            return x * pow(x,n-1);
        }
        return pow(x * x,n / 2);
    }
}