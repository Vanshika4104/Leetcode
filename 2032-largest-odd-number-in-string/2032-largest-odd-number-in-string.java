class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        String str="";

        for(int i=n-1; i>=0;i--){
            int s=num.charAt(i)-'0';
            if(s%2==1){
                str=num.substring(0,i+1);
                break;
            }
        }
        return str;

    }
}