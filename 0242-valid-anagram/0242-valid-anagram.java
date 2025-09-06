class Solution {
    public static String SortString(String str){
        char[] c=str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();

        if(n!=m){
            return false;
        }
        s=SortString(s);
        t=SortString(t);
        for(int i=0; i<n;i++){
            if(s.charAt(i)!= t.charAt(i)){
                return false;
            }

        }
        return true;

    }
}