class Solution {
    public void sortColors(int[] nums) {
        int curr = 0, start = 0, end = nums.length - 1;
        
        while(curr <= end) {
            if(nums[curr] == 0) {
                int temp = nums[curr];
                nums[curr] = nums[start];
                nums[start] = temp;
                curr++;
                start++;
             }
            else if(nums[curr] == 2) {
                int temp = nums[curr];
                nums[curr] = nums[end];
                nums[end] = temp;
                end--;
            }
            else {
                curr++;
            }
        }
    }
}