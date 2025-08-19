class Solution {
    public int missingNumber(int[] nums) {
        int n= nums.length;
        long totalsum= (long)n*(n+1)/2;
        int actualsum=0;
        
        for(int i=0; i< nums.length; i++){
            actualsum+=nums[i];
        }
        
        return (int) (totalsum - actualsum);
    }
}