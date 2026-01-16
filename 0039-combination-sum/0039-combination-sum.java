class Solution {
    List<List<Integer>>result=new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0 ,target,candidates,new ArrayList<>());
        return result;
    }
    public void backtrack(int index ,int target,int[] candidates,List<Integer>temp){
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        if(target<0){
            return;
        }
        for(int i=index;i<candidates.length;i++){
            temp.add(candidates[i]);
            backtrack(i ,target-candidates[i],candidates,temp);
            temp.remove(temp.size()-1);            
        }
        
    }
}