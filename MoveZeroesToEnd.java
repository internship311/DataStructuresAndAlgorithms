class Solution {
    public void moveZeroes(int[] nums) {
        int slowPtr = 0;
        int fastPtr = 0;
        
        while (fastPtr != nums.length) {
            int curr = nums[fastPtr];
            if (curr != 0) {
                nums[slowPtr] = curr;
                slowPtr++;
            }
            fastPtr++;
        }
        
        while (slowPtr != nums.length) {
            nums[slowPtr] = 0;
            slowPtr++;
        }
    }
}