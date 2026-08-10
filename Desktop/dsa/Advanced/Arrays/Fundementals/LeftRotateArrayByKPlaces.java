package Fundementals;
public class LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 2;
        int n = nums.length - 1;
        k = k % nums.length;
        rotate(nums,0,k-1);
        rotate(nums,k,n);
        rotate(nums,0,n);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
    static void rotate(int[] nums,int left,int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
