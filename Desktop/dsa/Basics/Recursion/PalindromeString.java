// package Basics.Recursion;

public class PalindromeString {
    public static void main(String[] args) {
        String s = "hannah";
        System.out.println(isPalindrome(0,s.length()-1,s));
    }
    static boolean isPalindrome(int left,int right,String s) {
        if(left >= right) {
            return true;
        }
        if(s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return isPalindrome(left + 1,right -1,s);
    }

}
