class Solution {
    public String reverseWords(String s) {
       
        String[] words= s.split("\\s+");
        int n= words.length;
        StringBuilder str= new StringBuilder();
        
        for(int i=n-1; i>=0; i--){
            str.append(words[i]);
            if(i !=0){
                str.append(" ");
            }
        }
        return str.toString().trim();
    }
}