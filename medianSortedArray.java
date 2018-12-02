import java.io.*;
import java.util.*;

// O(m+n) time
public class medianSortedArray {

    public double findMedianSortedArrays (int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];

        for (int p=0; p<nums.length; p++) {
            nums[p] = 0;
        }
        int k =0;
        int i = 0;
        int j = 0;

        if (nums1.length > 0 && nums2.length>0) {
            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j]) {
                    nums[k] = nums1[i];
                    i++;
                } else {
                    nums[k] = nums2[j];
                    j++;
                }
                k++;
            }
        }

        if (i == nums1.length) {
            while (j < nums2.length) {
                nums[k] = nums2[j];
                j++;
                k++;
            }
        } else if (j == nums2.length) {
            while(i < nums1.length) {
                nums[k] = nums1[i];
                i++;
                k++;
            }
        }

        if (nums.length%2 == 1) {
            int index = (nums.length - 1)/2;
            return nums[index];
        } else {
            return (double) (nums[nums.length/2 - 1] + nums[nums.length/2])/2;
        }
    }
}