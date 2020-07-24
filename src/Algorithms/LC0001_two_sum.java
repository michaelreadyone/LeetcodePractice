package Algorithms;


public class LC0001_two_sum {
    /**
     * Input:
     * @param nums an integer array
     * @param target an integer
     *
     * Output:
     * @return an integer array with two elements
     *
     * Edge cases:
     * no answer, more than one group of answer, element added by itself to be an answer
     *
     * Assumptions:
     * Each input would have exactly one solution, and you may not use the same element twice.
     */
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        for(int left = 0; left < nums.length-1; left++){
            for(int right = left+1; right < nums.length; right++) {
                if (nums[left] + nums[right] == target) {
                    ans[0] = left;
                    ans[1] = right;
                    break;
                }
            }
        }
        return ans;
    }
}
