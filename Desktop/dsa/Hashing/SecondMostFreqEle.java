package Hashing;

import java.util.HashMap;
import java.util.Map;

public class SecondMostFreqEle {
    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 5, 6, 7};
        int n = nums.length;
        if(n == 1) {
            System.out.println(-1);
            return;
            
        }
        Map<Integer,Integer> map = new HashMap<>();
        int first = -1;
        int firstFreq = 0;
        int second = -1;
        int secondFreq = 0;
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
            int freq = map.get(num);
            if(freq > firstFreq) {
                first = num;
                firstFreq = freq; 
            }   
        }
        
        for(int num : map.keySet()) {
            int freq = map.get(num);
            if(freq < firstFreq && freq >= secondFreq) {
                if(freq == secondFreq && num < second) {
                    second = num;
                    //return smallest one if two elements have the same frequency
                }
                else if(freq > secondFreq && freq < firstFreq) {
                    second = num;
                    secondFreq = freq;
                }
            }
        }
        
    }
    
}
