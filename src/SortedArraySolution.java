// Testing runtime = 4 ms
import java.util.Arrays;
public class SortedArraySolution {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}