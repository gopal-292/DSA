import java.util.List;
import java.util.ArrayList;

public class CombinationSum {
    public static void main(String[] args) {
        int[] nums= {2,3,5,4};
        int target = 7;
        List<List<Integer>> ans = new ArrayList<>();
        ans = combinationSum(nums,target);
        System.out.println(ans);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combSum(0,target,candidates,list,ans);
        return ans;
    }
    static void combSum(int index,int sum,int[] nums,List<Integer> list,List<List<Integer>> ans) {
        if(sum == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(sum < 0 || index == nums.length) {
            return;
        }
        list.add(nums[index]);
        combSum(index,sum - nums[index],nums,list,ans);
        
        list.remove(list.size() - 1);
        combSum(index + 1,sum,nums,list,ans);
        
    }
}