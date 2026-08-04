public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {5,7,3,5,6};
        int target = 5;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == target) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}