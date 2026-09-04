public class KadanesAlgo {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, -2, 7, -4};
        int max = Integer.MIN_VALUE;
        int cur = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i < nums.length;i++) {
            sum += nums[i];
            sum = Math.max(sum,nums[i]);
            max = Math.max(sum,max);

        }
        System.out.println(max);
    }
}
