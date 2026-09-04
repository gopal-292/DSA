package Advanced.Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,1,6,4};
        sort(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void sort(int[] nums) {
        int n = nums.length;
        for(int i = 1;i < n;i++) {
            int key = nums[i];
            int j = i - 1;
            while(j >=0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
    
}
