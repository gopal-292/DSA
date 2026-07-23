package Strings;

public class LargestOddNum {
    public static void main(String[] args) {
        String s = "00612587";
        int n = s.length();
        int start = 0;
        for(int i = 0;i < n;i++) {
            if(s.charAt(i) != '0') {
                start = i;
                break;
            }
        }
        for(int i = n-1;i >= 0;i--) {
            if((s.charAt(i) - '0') % 2 != 0) {
                System.out.println(s.substring(start,i+1));
                break;
            }

        }
    }
}
