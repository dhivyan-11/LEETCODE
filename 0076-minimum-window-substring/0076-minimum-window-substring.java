class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";

        int freq[]=new int[128];
        for (char c:t.toCharArray())freq[c]++;

        int left=0 , right=0;
        int start=0;
        int minLen=Integer.MAX_VALUE;
        int required=t.length();

        while(right<s.length()){
            char c =s.charAt(right);
            if(freq[c]>0) required--;
            freq[c]--;
            right++;

            while(required==0){
                if(right-left<minLen){
                    minLen=right-left;
                    start=left;
                    
                }
                char leftchar=s.charAt(left);
                freq[leftchar]++;
                if(freq[leftchar]>0)required++;
                left++;
            }

        }
        return minLen==Integer.MAX_VALUE ?"":s.substring(start,start+minLen);

        
    }
}