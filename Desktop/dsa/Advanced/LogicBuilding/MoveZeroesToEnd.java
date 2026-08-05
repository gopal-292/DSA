package Advanced.LogicBuilding;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] nums = {0,1,4,0,5,2};
        int n = nums.length;
        
        for(int i = 0;i < n;i++) {
            
            if(nums[i] == 0) {
                int j = i + 1;
                while(j < n  && nums[j] == 0) {
                    j++;
                }
                if(j < n) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
}
