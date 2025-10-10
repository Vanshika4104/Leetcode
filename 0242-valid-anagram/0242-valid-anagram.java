class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        if(n!=m){
            return false;
        }
        for(int i=0; i<n ; i++){
            if(sArr[i] !=tArr[i]){
                return false;
            }
        }
        return true;
    }
}