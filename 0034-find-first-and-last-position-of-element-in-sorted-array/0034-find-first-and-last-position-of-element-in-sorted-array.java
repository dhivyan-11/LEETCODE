class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1,-1};
        int left=binarySearch(nums , target ,true);
        int right = binarySearch(nums , target ,false);
        result[0]=left;
        result[1]=right;
        return result;
    }

    private int binarySearch(int[] nums , int target ,boolean isSearchingleft){
        int left=0;
        int right=nums.length-1;
        int res=-1;

        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]>target){
                right=mid-1;

            }
            else if (nums[mid]<target){
                left=mid+1;
            }
            else{
                res=mid;

                if(isSearchingleft){
                    right=mid-1;
                }
                else{
                   left=mid+1;
                }
            }
        }
     
        return res;
    }
}