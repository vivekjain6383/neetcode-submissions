class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int n= prices.length;
        int a=prices[0];

        for(int sell: prices){
            ans = Math.max(sell-a, ans);
            a = Math.min(a,sell);
        }
        return ans;
    }
}
