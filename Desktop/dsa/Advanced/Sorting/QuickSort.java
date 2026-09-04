package Advanced.Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int nums[] = {4,2,7,3,5};
        quickSort(0,nums.length - 1,nums);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
    static void quickSort(int low,int high,int[] nums) {
        if(low < high) {
            int p = partition(low,high,nums);
            quickSort(low, p - 1, nums);
            quickSort(p + 1, high, nums);
        }
    }
    static int partition(int low,int high,int[] arr) {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i < j) {

            while(j >= low && arr[j] > pivot) {
                j--;
            }

            while(i <= high && arr[i] <= pivot) {
                i++;
            }

            if(i < j)
                swap(i,j,arr);

        }
        swap(j,low,arr);
        return j;
    }
    static void swap(int i,int j,int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
