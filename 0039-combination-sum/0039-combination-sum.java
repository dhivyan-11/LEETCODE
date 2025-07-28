class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>result=new ArrayList<>();
       
        backtrack(candidates , target , new ArrayList<>() , result ,0,0);
        return result;
        
    }
    private void backtrack(int[] candidates , int target , List<Integer>temp , List<List<Integer>>result ,int start,int val){
        if(val==target){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(val>target)return;
        for(int i=start;i<candidates.length;i++){
            temp.add(candidates[i]);
            
            backtrack(candidates , target , temp, result ,i,val+candidates[i]);
            temp.remove(temp.size()-1);}
       
    }
}