class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        int n=nums.length;
        Set<Integer> map = new HashSet<>();
        for(int i=0;i<n;i++){
            map.add(nums[i]);
        }
        int c=0,x=0;
        for(int e:map){
            x = e;
            if(map.contains(x-1))continue;
            while(map.contains(x)){
                c++;
                x++;
                ans = Math.max(ans, c);
            }c=0;   
        }
        return ans;
    }
}
