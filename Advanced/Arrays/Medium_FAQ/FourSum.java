import java.util.*;
public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1, -2, 3, 5, 7, 9};
        int target = 7;
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i < n - 3;i++) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for(int j = i  + 1;j < n;j++) {
                if(j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                int left = j + 1;
                int right = n - 1;
                while(left < right) {
                    long sum = (long)nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum == target) {
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[left]);
                        l.add(nums[right]);
                        list.add(l);
                        left++;
                        right--;
                        while(left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                        while(left < right && nums[right] == nums[right + 1]) {
                            right--;
                        }
                    }
                    else if(sum > target) {
                        right--;
                    }
                    else {
                        left++;
                    }
                }
            }
        }
        for(List<Integer> l : list) {
            for(int i : l) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    
}
