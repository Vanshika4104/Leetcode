class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1){
            return 0;
        }
        int n=nums.length;
        int count=0;
        long prod=1;
        int j=0;
        for(int i=0; i<n;i++){
            prod*=nums[i];
            while(prod>=k && j<=i){
                prod /=nums[j];
                j++;
            }
            count+=i-j+1;
        }
        return count;
    
    }
}