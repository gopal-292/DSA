package Basics.Strings;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "eat",t = "tea";
        if(s.length() != t.length()) {
            System.out.println(false);
            return;
        }
        int[] m1 = new int[256];
        for(int i = 0;i < s.length();i++) {
            m1[s.charAt(i)]++;
            m1[t.charAt(i)]--;
        } 
        for(int i = 0; i < 256; i++) {
            if(m1[i] != 0) {
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
