class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int move=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){
                int required = nums[i-1]+1;
                move+=required-nums[i];
                nums[i]=required;
            }
        }
        return move;
    }
}
