class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int n=nums.length;
        int maxm=0;
        for(int i=0; i<n;i++){
            if(nums[i]==1){
                count+=1;
            }
            else{
                count=0;
            }
            maxm= Math.max(maxm,count);
        
        }
        return maxm;
    }
}