package Medium_FAQ;

import java.util.ArrayList;
import java.util.List;

public class RearrangeBySign {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};
        int n = nums.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i = 0;i < n;i++) {
            if(nums[i] > 0) {
                pos.add(nums[i]);
            }
            else {
                neg.add(nums[i]);
            }
        }
        for(int i = 0;i < n/2;i++) {
            nums[2 * i] = pos.get(i);
            nums[2 * i + 1] = neg.get(i);
        }
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
}
