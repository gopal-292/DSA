package Advanced.Sorting;
public class  MergeSort {
    public static void main(String[] args) {
        int[] nums = {3,5,7,2,4,8};
        
        int high = nums.length-1;
        int low = 0;
        mergesort(nums,low,high);
        for(int i : nums) {
            System.out.print(i + " ");
        }
    }
        
    static void mergesort(int[] nums,int low,int high) {
        if(low < high) {
            int mid = (low + high) / 2;
            mergesort(nums,low,mid);
            mergesort(nums,mid + 1,high);
            merge(nums,low,mid,high);
        }
    }
    static void merge(int[] nums,int low,int mid,int high) {
        int i = 0;
        int j = 0;
        int k = low;
        int n1 = mid - low + 1;
        int n2 = high - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int m = 0;m <n1;m++) {
            L[m] = nums[low + m];
        }
        for(int m = 0;m < n2;m++) {
            R[m] = nums[mid + 1 + m];
        }

        while(i < n1 && j < n2) {
            if(L[i] < R[j]) {
                nums[k] = L[i];
                k++;
                i++;
            }
            else {
                nums[k] = R[j];
                k++;
                j++;
            }
        }
        while(i < n1) {
            nums[k++] = L[i++];
        }
        while(j < n2) {
            nums[k++] = R[j++];
        }
         
    }
}
