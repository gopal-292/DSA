public class NextPermutation {
    public static void main(String[] args) {
        int[] nums = {2,1,5,3,0,0};
        int ind = -1;
        int n = nums.length;
        for(int i = n - 2;i >= 0;i--) {
            if(nums[i] < nums[i + 1]) {
                ind = i;
                break;
            }
        }
        if(ind != -1) {
            for(int i = n - 1;i > ind;i--) {
                if(nums[i] > nums[ind]) {
                    int temp = nums[i];
                    nums[i] = nums[ind];
                    nums[ind]  = temp;
                    break;
                }
            }
            
            reverse(ind + 1,n - 1,nums);
            for(int i : nums) {
                System.out.print(i + " ");
            }
            return;
        }
        reverse(0,n-1,nums);
    }
    static void reverse(int left,int right,int[] nums) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    
}