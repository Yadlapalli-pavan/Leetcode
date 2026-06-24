class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer>pavan=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            if(pavan.containsKey(n)){
                int a=pavan.get(n);
                pavan.put(n,a+1);
            }
            else{
                pavan.put(n,1);
            }
        }
        int maxkey=0;
        for(int i:pavan.keySet()){
            if(pavan.get(i)==1){
                maxkey=i;
                return maxkey;
            }
        }
        return maxkey;
    }
}