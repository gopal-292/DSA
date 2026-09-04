import java.util.*;
class GenerateParanthesis {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int n = 3;
        String ans = "";
        int open = 0,close = 0;
        genPar(ans,open,close,list,n);
         for(String s : list) {
            System.out.println(s);
         }
    }
    static void genPar(String ans,int open,int close,List<String> list,int n) {
        if(open > n) {
            return;
        }


        if(open + close == 2*n && close == open) {
            list.add(ans);
            return;
        }
        genPar(ans + "(",open + 1,close,list,n);
        if(open > close) {
            genPar(ans + ")",open,close + 1,list,n);
        }
        

    }
}