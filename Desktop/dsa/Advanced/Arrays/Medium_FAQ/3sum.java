class 3sum {
    public static void main(String[] args) {
        int[] nums = {2, -2, 0, 3, -3, 5};
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);  
        for(int i = 0;i < n;i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;
            
            while(left < right) {
                int leftEle = nums[left];
                int rightEle = nums[right];
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    list.add(l);
            
                    while(left < right && leftEle == nums[left]) {
                        left++;
                    }
                    while(left < right && rightEle == nums[right]) {
                        right--;
                    }
                }
                else if(sum > 0) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }
    }
}