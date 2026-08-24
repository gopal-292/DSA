package Advanced.Recursion;
import java.util.*;


class PowerSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        pSet(ans,list,0,nums);
        for(List<Integer> l : ans) {
            System.out.println(l);
        }
    }
    static void pSet(List<List<Integer>> ans,List<Integer> list,int index,int[] nums) {
        if(index == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }
        pSet(ans,list,index + 1,nums);
        list.add(nums[index]);
        pSet(ans,list,index + 1,nums);
        list.remove(list.size() - 1);

    
    }
}