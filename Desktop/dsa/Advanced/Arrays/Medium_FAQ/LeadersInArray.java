package Medium_FAQ;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeadersInArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 3, 1, 2};
        List<Integer> list = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int[] arr = new int[nums.length];
        for(int i = nums.length - 1;i >= 0;i--) {
            if(nums[i] > max) {
                arr[i] = nums[i];
                max = nums[i];
            }
            else {
                arr[i] = max;
            }
        }
        for(int i = 0;i < nums.length;i++) {
            if(nums[i] == arr[i] && !s.contains(nums[i])) {
                list.add(nums[i]);
                s.add(nums[i]);
            }
        }
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
    
}
