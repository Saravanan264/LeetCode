class Solution {
    public int dominantIndex(int[] nums) {
        int largest=nums[0];
        int largestindex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>largest){
                largest=nums[i];
                largestindex=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i!=largestindex && largest<2*nums[i]){
                return -1;
            }
        }
        return largestindex;
    }
}