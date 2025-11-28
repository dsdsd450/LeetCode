class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int subLength=0;
        int sum=0;
        int result=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(sum>=target){
                    subLength=j-i+1;
                    result=result<subLength?result:subLength;
                    break;
                }
            }
        }
        return result==Integer.MAX_VALUE ? 0 : subLength;
        
    }
}