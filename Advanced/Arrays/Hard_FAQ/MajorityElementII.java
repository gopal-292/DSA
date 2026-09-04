package Hard_FAQ;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 3, 2};
        int cnt1 = 0;
        int cnt2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < nums.length;i++) {
            if(cnt1 == 0 && nums[i] != ele2) {
                cnt1++;
                ele1 = nums[i];
            }
            else if(cnt2 == 0 && nums[i] != ele1) {
                cnt2++;
                ele2 = nums[i];
            }
            else if(nums[i] == ele1) {
                cnt1++;
            }
            else if(nums[i] == ele2) {
                cnt2++;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for(int i : nums) {
            if(i == ele1)
            cnt1++;
            else if(i == ele2)
            cnt2++;
        }
        if(cnt1 > (n / 3)) {
            ans.add(ele1);
        }
        if(cnt2 > (n / 3)) {
            ans.add(ele2);
        }
        System.out.println(ele1 + " " + ele2);
    }
}
