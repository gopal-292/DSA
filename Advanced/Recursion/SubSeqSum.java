class SubSeqSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 2;
        System.out.println(checkSubsequenceSum(nums,k));
        
    }
    public static boolean checkSubsequenceSum(int[] nums, int k) {
        return subSeqSum(0,nums,k);
    }
    static boolean subSeqSum(int ind,int[] nums,int sum) {
        if(sum == 0) {
            return true;
        }
        if(sum < 0 || ind == nums.length) {
            return false;
        }
        boolean path1 = subSeqSum(ind + 1,nums,sum - nums[ind]);
        boolean path2 = subSeqSum(ind + 1,nums,sum);
        return path1 || path2;
    }
}