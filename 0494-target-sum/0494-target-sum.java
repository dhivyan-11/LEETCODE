class Solution {
    int count=0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums ,0 ,0 , target);
        return count;      
    }
    public void backtrack(int nums[] , int index , int currentsum , int target){
        if(index==nums.length){
            if(target==currentsum) count++;
            return;
        }
        backtrack(nums , index+1 , currentsum+nums[index],target);

        backtrack(nums , index+1 ,currentsum-nums[index],target );

    }
}