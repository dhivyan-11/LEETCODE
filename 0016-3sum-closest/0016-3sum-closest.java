class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=Integer.MAX_VALUE/2;
        for(int i=0;i<=nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int current=nums[i]+nums[j]+nums[k];
                if(Math.abs(current-target)<Math.abs(close-target)){
                    close=current;

                }
                if(current<target){
                    ++j;
                    
                }
                else if(current>target){
                    --k;

                }
                else{
                    return current;
                }
            }
           
        }
         return close;
    }
}
    
       