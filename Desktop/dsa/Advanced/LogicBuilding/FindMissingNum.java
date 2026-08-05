package Advanced.LogicBuilding;

public class FindMissingNum {
    public static void main(String[] args) {
        int[] nums = {0,2,6,1,4};
       int n = nums.length;
        int i = 0;
        while(i < n) {
            if(nums[i] == i) {
                i++;
            }
            else {
                if(nums[i] < n) {
                    swap(nums,i,nums[i]);
                }
                else {
                    i++;
                }
            }
        }
        for(int j = 0;j < n;j++) {
            if(nums[j] != j) {
                System.out.println(j);
                return;
            }
        }
        System.out.println(n);
    }
    static void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
