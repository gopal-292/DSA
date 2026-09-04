package Advanced.Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,5,3,6,4};
         int n = arr.length;
        
        for(int i = 0;i < n;i++) {
            int min = arr[i];
            int minIndex = i;
            int j = i+1;
            for(j = i + 1;j < n;j++) {
                if(arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if(minIndex != i) {
                int temp = arr[i];
                arr[i] = min;
                arr[minIndex] = temp;
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
