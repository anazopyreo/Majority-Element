// Thanks MindOfshridhar
// https://leetcode.com/problems/majority-element/solutions/4716924/beats-100-users-easy-understood-solution-with-optimized-space-3-approaches
// Testing runtime = 1 ms
class FastSolution {
    public static int majorityElement(int[] nums) {
        int count = 0;
        int majority = 0;
        for (int i : nums) {
            if (count == 0) {
                majority = i;
            }
            if (majority == i) {
                count++;
            } else {
                count--;
            }
        }
        return majority;
    }
}