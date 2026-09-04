// package Basics.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        ArrayList<Character> s =  new ArrayList<>(Arrays.asList('h', 'e', 'l', 'l', 'o'));
        System.out.println(rev(0,s.size()-1,s));
    }
    static ArrayList<Character> rev(int left,int right,ArrayList<Character> s) {
        if(left >= right) {
            return s;
        }
        char ele = s.get(left);
        s.set(left,s.get(right));
        s.set(right,ele);
        return rev(++left,--right,s);
    }
}
