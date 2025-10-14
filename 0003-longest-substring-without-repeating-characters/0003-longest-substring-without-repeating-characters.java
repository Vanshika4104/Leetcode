class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxL=0;
        int left=0;

        HashSet<Character> charset= new HashSet<>();

        for( int right=0; right < n; right++){
            while(charset.contains(s.charAt(right))){
                charset.remove(s.charAt(left));
                left++;
            }

            charset.add(s.charAt(right));
            maxL=Math.max(maxL , right-left+1);
        }

        return maxL;

    }
}