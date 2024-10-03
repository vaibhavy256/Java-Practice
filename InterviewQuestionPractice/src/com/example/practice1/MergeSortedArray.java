package com.example.practice1;

//Example 1:
//
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

public class MergeSortedArray {

    public static void main(String args[]) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, nums2, m, n);
        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    private static void merge(int[] nums1, int[] nums2, int m, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            //to sort elements from first array
            if (i >= 0 && nums1[i] >= nums2[j]) {
                //adding elements in merged array
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }
    }
}
