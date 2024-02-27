public class Main {
    public static void main(String[] args) {
        int[] nums1 = {3,2,3};
        int output1 = 3;

        int[] nums2 = {2,2,1,1,1,2,2};
        int output2 = 2;

        System.out.println("\nSortedArraySolution");
        System.out.println(SortedArraySolution.majorityElement(nums1) == output1);
        System.out.println(SortedArraySolution.majorityElement(nums2) == output2);

        System.out.println("\nHashMapSolution");
        System.out.println(HashMapSolution.majorityElement(nums1) == output1);
        System.out.println(HashMapSolution.majorityElement(nums2) == output2);

        System.out.println("\nFastSolution");
        System.out.println(FastSolution.majorityElement(nums1) == output1);
        System.out.println(FastSolution.majorityElement(nums2) == output2);
    }
}