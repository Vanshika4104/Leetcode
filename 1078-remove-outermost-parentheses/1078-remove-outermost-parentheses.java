import java.util.*;
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans= new StringBuilder();
        char[] a= s.toCharArray();
        int n= a.length;
        int count=0;

        for(int i=0 ; i< n; i++){
            if(a[i] == '('){
                if(count>0) ans.append('(');
                count++;
            }else{
                count--;
                if(count>0 ) ans.append(')');            
            }
        }
        return ans.toString();
    }
}