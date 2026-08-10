package Medium_FAQ;
import java.util.HashMap;
public class MajorityElementI {
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        HashMap<Integer,Integer> map = new HashMap<>();
        int majEle = 0;
        int maxFreq = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) > maxFreq) {
                maxFreq = map.get(nums[i]);
                majEle = nums[i];
            }
        }
        System.out.println(majEle);

        //OPTIMAL SOLUTION

        //int cnt = 0;
        // int ele = 0;
        // for(int i = 0;i < nums.length;i++) {
        //     if(cnt == 0) {
        //         ele = nums[i];
        //         cnt++;
        //     }
        //     else if(nums[i] == ele) {
        //         cnt++;
        //     }
        //     else {
        //         cnt--;
        //     }
        // }
        // return cnt > 0 ? ele : -1;
    }
    
}