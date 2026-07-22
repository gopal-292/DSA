public class IsSorted {
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,7,9,0};
        for(int i = 0;i < arr.length-1;i++) {
            if(arr[i+1] < arr[i]) {
                System.out.println("Not Sorted");
                return;
            }
       }
       System.out.println("Sorted");
    }
}
