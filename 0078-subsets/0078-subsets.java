    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(0, nums , result , new ArrayList<>());
            
            return result;
                
        }
        private void backtrack(int index , int[] nums , List<List<Integer>> result , List<Integer>temp){
            
                result.add(new ArrayList<>(temp));
               
            for (int i = index; i < nums.length; i++){

                temp.add(nums[i]);
                backtrack(i+1 ,nums , result , temp);
                temp.remove(temp.size()-1);
            }
        }
    }