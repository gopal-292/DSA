import java.util.HashMap;
public class MajorityElementI {
    public static void main(String[] args) {
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int maxFreq = Integer.MIN_VALUE;
        for(int i = 0;i < nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            if(map.get(nums[i]) > maxFreq) {
                maxFreq = map.get(nums[i]);
                max = nums[i];
            }
        }
        System.out.println(max);
    }
    
}