package Medium_FAQ;

public class PascalsTriangleII {
    public static void main(String[] args) {
        int r = 7;
        int[] ans = new int[r];
        ans[0] = 1;
        for(int i = 1;i < r;i++) {
            ans[i] = (ans[i - 1] * (r - i)) / i;
        }
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
