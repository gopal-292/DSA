// package Basics.Recursion;

public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        reverse(0,nums.length-1,nums);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
    static void reverse(int left,int right,int[] nums) {
        if(left >= right) {
            return;
        }
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        reverse(left + 1,right - 1,nums);
    }
}
