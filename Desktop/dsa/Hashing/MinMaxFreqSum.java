package Hashing;
import java.util.HashMap;

public class MinMaxFreqSum {
    public static void main(String[] args) {
        int[] nums = {2,2,3,3,4,3,5,6};
        HashMap<Integer,Integer> map = new HashMap<>();
        int minFreq = Integer.MAX_VALUE;
        int maxFreq = 0;
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }     
        for(HashMap.Entry entry : map.entrySet()) {
            int value = (int)entry.getValue();
            if(value > maxFreq) {
                maxFreq = value;
            }
            if(value < minFreq) {
                minFreq = value;
            }
        }
        System.out.println(minFreq + maxFreq);
    }
}