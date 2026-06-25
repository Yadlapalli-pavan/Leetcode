class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wsum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            wsum=wsum+nums[i];
        }
        double maxavg=(double)wsum/k;
        for(int i=k;i<nums.length;i++){
            wsum=wsum-nums[i-k]+nums[i];
            avg=(double)wsum/k;
            maxavg=Math.max(maxavg,avg);
        }
        return maxavg;
    }
}