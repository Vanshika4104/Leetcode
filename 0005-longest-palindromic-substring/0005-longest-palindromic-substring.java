class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        int maxl=1;
        int substart=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=1; j++){
                int low=i;
                int high=i+j;

                while(low>=0 && high<n && s.charAt(low)==s.charAt(high)){
                    int currl= high-low+1;
                    if(currl> maxl){
                        substart= low;
                        maxl=currl;
                    }
                    low--;
                    high++;
                }
            }
        }
        return s.substring(substart, substart+ maxl);
    }
}