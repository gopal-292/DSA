package Strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {
    public static void main(String[] args) {
        List<Character> s =  new ArrayList<>(List.of('h','e','l','l','o'));
        int n = s.size();
        int r = n - 1;
        int l = 0;
        while(l < r) {
            char temp = s.get(l);
            s.set(l,s.get(r));
            s.set(r,temp);
            l++;
            r--;
        }
        System.out.println(s);
    }
}
