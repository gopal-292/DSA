package Arrays;
public class SumOfArray {
    public static void main(String[] args) {
        int arr[] = {2,3,5,6,8};
        int sum  = 0;
        for(int i = 0;i < arr.length;i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
