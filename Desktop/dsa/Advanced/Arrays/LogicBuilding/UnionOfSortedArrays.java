package LogicBuilding;

import java.util.TreeSet;

public class UnionOfSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,7};
        TreeSet<Integer> ans = new TreeSet<>();
        for(int num : nums1) {
            ans.add(num);
        }
        for(int num : nums2) {
            ans.add(num);
        }
        int union[] = new int[ans.size()];
        int i = 0;
        for(int num : ans) {
            union[i++] = num;
        }

        for(int a : union) {
            System.out.print(a + " ");
        }

    }
}
