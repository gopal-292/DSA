package LogicBuilding;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int nums[] = {0,0,3,3,4,5};
        int n = nums.length;
        int count = 0;
        for(int i = 0;i < n;i++) {
            if(i < n-1 && nums[i] == nums[i + 1]) {
                continue;
            }
            else {
                nums[count++] = nums[i];
            }

        }
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
}
