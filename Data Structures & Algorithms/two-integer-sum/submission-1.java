class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums)s.add(i);
        int[] ans = new int[2];
        int x=0,y=0;
        for(int i=0;i<nums.length;i++){
            if(s.contains(target-nums[i])){
                x=i;
                
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(target-nums[x]==nums[i]){y=i;}
        }
        if(x>y){ans[0]=y;ans[1]=x;}
        else {ans[0]=x;ans[1]=y;}

        return ans;
    }
}
