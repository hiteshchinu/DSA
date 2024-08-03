package LeetcodeArrays;

public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            // for(int i = 0;i < n;i++){
            //     nums1[i+m] = nums2[i];
            // }
            // Arrays.sort(nums1);
    
            // Start from the end of the two arrays
            int p1 = m - 1; // Pointer for nums1
            int p2 = n - 1; // Pointer for nums2
            int p = m + n - 1; // Pointer for the merged array
    
            // While there are elements to be processed in nums2
            while (p2 >= 0) {
                // If nums1 is exhausted, or nums2's element is larger, place nums2's element
                if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                    nums1[p] = nums1[p1];
                    p1--;
                } else {
                    nums1[p] = nums2[p2];
                    p2--;
                }
                p--;
            }
        }
    }
}
