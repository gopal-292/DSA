// package Basics.Recursion;

public class SumOfArray { 
    public static void main(String[] args) {
        int[] nums = {20,30,40,50};
        System.out.println(Sum(0,nums));
    }
   
    static int Sum(int i,int[] nums) {
        if(i >= nums.length) {
            return 0;
        }
        return nums[i] + Sum(i + 1,nums);
    }
    
}
