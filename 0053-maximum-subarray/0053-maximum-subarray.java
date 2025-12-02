class Solution {
    public int maxSubArray(int[] nums) {
        int curr= 0;
        int sum = nums[0];

        int n= nums.length;
        for(int i=0; i<n;i++){
            curr= Math.max(nums[i], curr+ nums[i]);
            if(sum < curr){
                sum=curr;
            }
        }
        return sum;
    }
}