class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n= s.length();
        int maxL=0;
        int left=0;

        HashSet< Character> charset= new HashSet<>();
        for(int i=0 ; i<n ; i++){
            while(charset.contains(s.charAt(i))){
                charset.remove(s.charAt(left));
                left++;
            }

            charset.add(s.charAt(i));
            maxL= Math.max(maxL, i-left+1);
        }
        return maxL;
    }
}