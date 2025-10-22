class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        if(n==1) return 1;
        for(int i=0; i<n;i++){
            for(int j=i; j<n;j++){
                if(isPalin(s, i, j)){
                    ans++;
                }
            }
        }

        return ans;
    }
    public static boolean isPalin( String s, int l, int r){
        while(l<r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }

}