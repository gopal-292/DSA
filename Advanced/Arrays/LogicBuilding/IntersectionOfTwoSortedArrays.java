package LogicBuilding;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,5,7};
        List<Integer> list = new ArrayList<>();
        int vis[] = new int[nums2.length];
        for(int i = 0;i < nums1.length;i++) {
            for(int j = 0;j < nums2.length;j++) {
                if(nums2[j] == nums1[i] && vis[j] == 0) {
                    list.add(nums2[j]);
                    vis[j] = 1;
                    break;
                }
                if(nums2[j] > nums1[i]) {
                    break;
                }
            }
        }
        int[] intersection = new int[list.size()];
        int index = 0;
        for(int i : list) {
            intersection[index++] = i;
        }
        for(int i : intersection) {
            System.out.print(i + " ");
        }
    
    }
}
