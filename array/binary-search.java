class Solution {
    public int search(int[] nums, int target) {
        if(target<nums[0]||target>nums[nums.length-1]){
            return -1;
        }
        int left=0,right=nums.length-1;

        while (left<=right){
            int middle=left+((right-left)>>1);
            if (nums[middle]>target){
                right=middle-1;
            }
            else if(nums[middle]<target){
                left=middle+1;
            }
            else if(nums[middle]==target){
                return middle;
            }
        }
        return -1;
    }
}
