class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int pre[] = new int[n];
        int suf[] = new int[n];
        int l=0, r=n-1;
        int a=height[0],b=height[n-1];
        pre[0]=a;
        suf[n-1]=b;
        int j=1;
        for(int i=1;i<n;i++){
            pre[i]=Math.max(pre[i-1],height[i]);
        }
        for(int i=n-2;i>=0;i--){
            suf[i] = Math.max(suf[i+1],height[i]);
        }
        int ans=0;

        for(int i=0;i<n;i++){
            ans+= Math.min(pre[i],suf[i])-height[i];
        }

        return ans;
    }
}
