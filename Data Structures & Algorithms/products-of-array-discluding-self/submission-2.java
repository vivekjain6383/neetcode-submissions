class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p=1,p1=1,z=0;
        for(int i:nums){
            p*= i;
            if(i==0){z++;continue;}
            p1*=i;
    
        }
        System.out.println(p+"-"+p1);
        for(int i=0;i<nums.length;i++){
            if(z>1){nums[i]=0;continue;}
            if(nums[i]==0){nums[i]=p1;continue;}

            nums[i]=p/nums[i];
        }return nums;
    }
}  
