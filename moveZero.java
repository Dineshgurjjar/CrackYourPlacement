class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;
        for(int cur =0;cur<nums.length;cur++){
            if(nums[cur] != 0){
                nums[lastNonZeroFoundAt] = nums[cur];
                lastNonZeroFoundAt++;
            }
        }
        for(int i = lastNonZeroFoundAt;i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}
