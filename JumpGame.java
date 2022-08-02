//Leetcode Problem Number 45

public class JumpGame {
    public int jump(int[] nums) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        
        for(int i = 0; i < nums.length - 1; i++) {
            
            farthest = Math.max(farthest, nums[i] + i);
            
            if(i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        
        return jumps;
    }
}
