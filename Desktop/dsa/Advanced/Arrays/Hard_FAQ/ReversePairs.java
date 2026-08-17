public class ReversePairs {
    public static void main(String[] args) {
        int[] nums = {6, 4, 1, 2, 7};
        
        int n = nums.length;
        int count = 0;
        for(int i = 0;i < n;i++) {
            for(int j = i + 1;j < n;j++) {
                long val = (long)nums[j] * 2;
                if(val > Integer.MAX_VALUE) {
                    continue;
                }
                if((long)nums[i] > val) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}