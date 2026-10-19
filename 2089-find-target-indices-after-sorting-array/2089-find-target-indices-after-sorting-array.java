class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        for(int i = 0; i < nums.length ; i++){
            int swaps = 0;
            for(int j = 0; j < nums.length -1-i; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swaps++;
                }
            }
            if(swaps == 0) break;
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
            ans.add(i);
            }
        }
        return ans;
    }
}