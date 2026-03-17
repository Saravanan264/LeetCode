class Solution {
    void backtrack(int[] nums,List<List<Integer>> result,List<Integer> temp,boolean[] taken){
        if(temp.size() == nums.length){
            if(!result.contains(temp)){
                result.add(new ArrayList<>(temp));
                return;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(taken[i]){
                continue;
            }
            temp.add(nums[i]);
            taken[i] = true;
            backtrack(nums,result,temp,taken);
            temp.remove(temp.size()-1);
            taken[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] taken = new boolean[nums.length];
        backtrack(nums,result,temp,taken);
        return result;
    }
}