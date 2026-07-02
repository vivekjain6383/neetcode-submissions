class Solution {
    public int longestConsecutive(int[] nums) {
        int ans=0;
        int n=nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(i, nums[i]);
        }
        int c=0,x=0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            x = e.getValue();
            while(map.containsValue(x)){
                c++;
                x++;
                ans = Math.max(ans, c);
            }c=0;   
        }
        return ans;
    }
}
