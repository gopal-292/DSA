package Medium_FAQ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 3, 1, 2};
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        
        for(int i = nums.length - 1;i >= 0;i--) {
            if(nums[i] > max) {
                list.add(nums[i]);
                max = nums[i];
            } 
        }
        Collections.reverse(list);
        for(int i : list) {
            System.out.print(i + " ");
        }
    }
    
}
