package medianoftwosortedarrays;

public class Solution {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int medianPosition = (length1 + length2) / 2 + 1;
        int median = 0;
        int last = median;
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < medianPosition; i++) {
            last = median;
            if (i1 == length1) {
                median = nums2[i2++];
                continue;
            }
            if (i2 == length2) {
                median = nums1[i1++];
                continue;
            }
            if (nums1[i1] < nums2[i2]) {
                median = nums1[i1++];
            } else {
                median = nums2[i2++];
            }
        }
        return (length1 + length2) % 2 == 0 ? (double) (median + last) / 2 : median;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

}
