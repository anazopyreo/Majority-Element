// Testing runtime = 12 ms
import java.util.HashMap;
public class HashMapSolution {
    public static int majorityElement(int[] nums) {
        int goal = nums.length / 2 + 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            int temp = map.getOrDefault(i,0) + 1;
            if(temp == goal) return i;
            map.put(i, temp);
        }
        return 0;
    }
}