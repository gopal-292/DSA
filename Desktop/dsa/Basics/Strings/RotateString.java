package Basics.Strings;
public class RotateString {
    public static void main(String[] args) {
        String s = "abcde",goal = "cdeab";
        boolean ans = (s.length() == goal.length()) && ((s + s).contains(goal));
        System.out.println(ans);
    }
}