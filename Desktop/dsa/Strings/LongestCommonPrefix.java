package Strings;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[]  str = {"flowers" , "flow" , "fly", "flight" };
        int n = str.length;
        if(n == 0) {
            System.out.println("");
            return;
        }
        String word = str[0];
        for(int i = 0;i<word.length();i++) {
            char ch = word.charAt(i);
            for(String s : str) {
                if(s.length() <= i) {
                    System.out.println(s);
                    return;
                }
                if(s.charAt(i) != ch) {
                    System.out.println(s.substring(0,i));
                    return;
                }
            }
        }
        System.out.println(word);
    }
}