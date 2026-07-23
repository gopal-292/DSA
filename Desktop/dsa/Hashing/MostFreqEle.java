package Hashing;
import java.util.*;
public class MostFreqEle {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3};
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
        }      
        int mostFreqEle = nums[0];
        int mostFreq = 0;
        for(Integer num : nums) {
            if(map.get(num) >= mostFreq) {
                if(map.get(num) == mostFreq) {
                    mostFreqEle = Math.min(num,mostFreqEle);
                    //if both have same freq then return the smallest among them
                }
                else {
                    mostFreqEle = num;
                    mostFreq = map.get(num);
                }
            }
        } 
        System.out.println(mostFreqEle);
    }
}
