public class RotateMatrix90 {
    public static void main(String[] args) {
        //Optimal Approach
        //Transpose the matrix and Reverse Each Row
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length;
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < i;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0;i < n;i++) {
            reverse(matrix[i]);
        }
        for(int i = 0;i < n;i++) {
            for(int j = 0;j < n;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void reverse(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
