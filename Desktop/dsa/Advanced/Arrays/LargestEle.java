public class LargestEle {
    public static void main(String[] args) {
        int nums[] = {55,4,3,66,23,33};
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] > maxElement) {
                maxElement = nums[i];
            }
        }
        System.out.println(maxElement);
    }
}