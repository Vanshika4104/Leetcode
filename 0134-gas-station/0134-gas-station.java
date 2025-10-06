class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum=0;
        int gain=0;
        int start=0; 
        for(int i=0; i<gas.length; i++){
                gain+=gas[i]-cost[i];
                sum+=gas[i]-cost[i];
                if(sum<0){
                    sum=0;
                    start=i+1;
                }
          
            
        }

        return (gain < 0) ? -1 : start;
    }
}