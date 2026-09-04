package Hard_FAQ;

public class MaxProductSubArray {
    public static void main(String[] args) {
        // Optimal Approach
        int[] nums = {-5, 0, -2};
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for(int i = 0;i < n;i++) {
            if(prefix == 0) {
                prefix = 1;
            }
            if(suffix == 0) {
                suffix = 1;
            }
            prefix *= nums[i];
            suffix *= nums[n - i - 1];
            max = Math.max(max,Math.max(suffix,prefix));

        }
        System.out.println("Maximum Product of SubArray : " + max);

        //Brute Force
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++) {
            max = Integer.MIN_VALUE;
            int prod = 1;
            for(int j = i;j < n;j++) {
                prod *= nums[j];
                max = Math.max(prod,max);
            }
            ans = Math.max(ans,max);
        }
        System.out.println("Maximum Product of SubArray : " + ans   );
    }
}