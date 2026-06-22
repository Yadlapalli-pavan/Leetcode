class Solution {
    public int minOperations(int[] nums, int k) {
        int mid=0;
    Arrays.sort(nums);
    for(int i=0;i<nums.length;i++){
        if(nums[i]>=k){
            mid=i;
            break;
        }
    }
    return mid;
    }
}