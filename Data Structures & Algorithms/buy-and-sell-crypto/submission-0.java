class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int n= prices.length;
        int a=prices[n-1];
        int[] p = new int[n];
        for(int i=0;i<n;i++)p[i]=prices[i];
        for(int i=n-2;i>=0;i--){
            a=p[i+1];
            p[i] = Math.max(a,prices[i]);
        }
        for(int i=0;i<n;i++){
            ans= Math.max(ans, p[i]-prices[i]);
        }
        return ans;
    }
}
