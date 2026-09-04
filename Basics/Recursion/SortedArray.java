// package Basics.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 9,3, 4, 5));
        System.out.println(isSort(0,nums));
    }
    private static boolean isSort(int left,ArrayList<Integer> nums) {
        if(left == nums.size() - 1) {
            return true;
        }
        if(nums.get(left) > nums.get(left + 1)) {
            return false;
        }
        return isSort(left + 1,nums);
    }

}
