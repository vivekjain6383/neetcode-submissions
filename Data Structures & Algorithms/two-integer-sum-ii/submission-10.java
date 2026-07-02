class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers.length<2)return new int[0];
        
        int[] ans = new int[2];
        if(numbers.length==2){
            if(target==(numbers[0]+numbers[1])){
                ans[0]=1;
                ans[1]=2;
                return ans;
            }
            else return new int[0];
        }
        int x=0,y=0;

        for(int i=0;i<numbers.length;i++){
            if((Arrays.binarySearch(numbers,target-numbers[i]))>=0){
            x=i;
            y=(Arrays.binarySearch(numbers,target-numbers[i]));
            break;}
        }

        if(x<y){ans[0]=x+1;ans[1]=y+1;}
        else{ans[0]=y+1;ans[1]=x+1;}
        return ans;
    }
}
