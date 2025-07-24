class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.isEmpty())
        {
            return result;
        }

        String []mapping=
        {
            "" , "" , "abc" , "def" , "ghi","jkl","mno","pqrs","tuv","wxyz"
        };
        backtracking(digits ,0 , new StringBuilder(),result , mapping);
        return result;
    }
    private void backtracking(String digits ,int index ,StringBuilder path ,List<String>result ,String[]mapping  )

    {
        
        if(index==digits.length()){
            result.add(path.toString());
            return;
        }
        
        String letters=mapping[digits.charAt(index)-'0'];
        for(int i=0;i<letters.length();i++){
                path.append(letters.charAt(i));
                backtracking(digits , index+1 ,path ,result ,mapping);
                path.deleteCharAt(path.length()-1);

        }

    }
}