package Fundementals;
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] = {1,1,0,0,1,1,1,0};
        int n = nums.length;
        int count = 0;
        int maxi = 0;
        for(int i = 0;i < n;i++) {
            if(nums[i] == 1) {
                count++;
                maxi = Math.max(count,maxi);
            }
            else {
                count = 0;
            }
        }
        System.out.println(maxi);
    }
}
