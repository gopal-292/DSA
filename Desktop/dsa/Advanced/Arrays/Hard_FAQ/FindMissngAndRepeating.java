package Hard_FAQ;

public class FindMissngAndRepeating {
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 1, 1};
        long n = nums.length;
        int[] ans = new int[2];
        long SN = (n * (n + 1)) / 2;
        long S2N = (n * (n + 1) * (2 * n +  1)) / 6;
        long S = 0,S2 = 0;
        for(int i : nums) {
            S += (long)i;
            S2 += (long)i * (long)i;
        
        }
        long val1 = S - SN; // x - y
        long val2 = (S2 - S2N) / val1; // x + y

        long x = (val1 + val2) / 2;
        long y = x - val1;
        ans[0] = (int)x;
        ans[1] = (int)y;

        for(int i : ans) {
            System.out.println(i);
        }
    }
}
