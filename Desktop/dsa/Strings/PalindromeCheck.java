package Strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s = "abbaa";
        int n = s.length();
        int l = 0;
        int r = n - 1;
        while(l < r) {
            if(s.charAt(l++) != s.charAt(r--)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
