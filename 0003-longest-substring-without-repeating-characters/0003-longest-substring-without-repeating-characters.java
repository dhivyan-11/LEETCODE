class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int max=0;
        HashSet<Character> ch = new HashSet<>();

        for(int right=0;right<s.length();right++)
        {
            while(ch.contains(s.charAt(right))){
                ch.remove(s.charAt(left));
                left++;
            }
            ch.add(s.charAt(right));
            max=Math.max(max , right-left+1);
           
        }

         return max;
    }
}