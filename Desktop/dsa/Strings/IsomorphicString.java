package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsomorphicString {
    public static void main(String[] args) {
        String  s = "egg" , t = "add";
        if(s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        Map<Character,Character> mappingStoT = new HashMap<>();
        Set<Character> setOfT = new HashSet<>();
        for(int i = 0;i < s.length();i++) {
            char c = s.charAt(i);
            char ch = t.charAt(i);
            if(mappingStoT.containsKey(c) ) {
                if(!(ch == mappingStoT.get(c))) {
                    System.out.println(false);
                    return;
                }
            }
            else {
                if(setOfT.contains(ch)) {
                    System.out.println(false);
                    return;
                }
                mappingStoT.put(c,ch);
                setOfT.add(ch);
            }
        }
        System.out.println(true);
    }
}
