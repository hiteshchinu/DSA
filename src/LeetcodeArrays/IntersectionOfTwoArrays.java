package LeetcodeArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i = 0; // nums1
        int j = 0; // nums2
        Set<Integer> set = new HashSet<>();
        
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                set.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        
        int[] result = new int[set.size()];
        int index = 0;
        for (int num : set) {
            result[index++] = num;
        }
        
        return result;
    }
}

}
