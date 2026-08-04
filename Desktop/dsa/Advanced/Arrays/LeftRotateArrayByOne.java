public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int n = nums.length;
        int leftMost = nums[0];
        for(int i = 0;i < n - 1;i++) {
            nums[i] = nums[i + 1];
        }
        nums[n - 1] = leftMost;
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
}
