public class Sort0s1s2s {
    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 1, 0};
        int high = nums.length - 1;
        int low = 0;
        int mid = 0;
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) {
                mid++;
                
            }
            else {
                swap(mid,high,nums);
                
                high--;
            }
        }
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
    static void swap(int i,int j,int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}
