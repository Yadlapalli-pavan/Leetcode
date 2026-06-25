class Solution {
    public int minimumRecolors(String blocks, int k) {
        char[] ch=blocks.toCharArray();
        int n=blocks.length();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n-k+1;i++){
            int whites=0;
            for(int j=i;j<i+k;j++){
                if(ch[j]=='W'){
                    whites++;
                }
            }
            min=Math.min(whites,min);
        }
        return min;
    }
}