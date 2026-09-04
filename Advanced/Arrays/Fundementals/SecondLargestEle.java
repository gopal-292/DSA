package Fundementals;
public class SecondLargestEle {
    public static void main(String[] args) {
        int[] nums = {2,6,8,5,3,9};
        if(nums.length <= 1) {
            System.out.println(-1);
            return;
        }
        int maxElement = Integer.MIN_VALUE;
        int secondMaxElement = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] > maxElement) {
                secondMaxElement = maxElement;
                maxElement = nums[i];
            }
            if(nums[i] > secondMaxElement && nums[i] < maxElement) {
                secondMaxElement = nums[i];
            }

        }
        if(secondMaxElement == Integer.MIN_VALUE)
            System.out.println(-1);
        System.out.println(secondMaxElement);
    }
    
}
