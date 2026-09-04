package Medium_FAQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleIII {
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>(Arrays.asList(1)));
        for(int i = 2;i <= n;i++) {
            List<Integer> l = new ArrayList<>();
            l.add(1);
            for(int j = 1;j < i;j++) {
              int ans = (l.get(j - 1) * (i - j)) / j;
                l.add(ans);
            }
            list.add(l);
        }
        for(List<Integer> l : list) {
            for(int i : l) {
                System.out.print(i + " ");
            } 
            System.out.println();
        }

        //OPTIMAL APP
        // int cnt = 0;
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
