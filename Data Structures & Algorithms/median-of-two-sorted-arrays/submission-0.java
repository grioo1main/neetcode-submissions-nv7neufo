class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] m = new int[nums1.length + nums2.length];
        int l = 0;
        int r = 0;
        int i = 0;
        
        while (l < nums1.length && r < nums2.length) {
            if (nums1[l] > nums2[r]) {
                m[i] = nums2[r]; 
                r++;
            } else {
                m[i] = nums1[l]; 
                l++;
            }
            i++;
        }
        
        while (l < nums1.length) {
            m[i] = nums1[l];
            l++;
            i++;
        }
        
        while (r < nums2.length) {
            m[i] = nums2[r];
            r++;
            i++;
        }
        
        if (m.length % 2 == 0) {
            return (m[m.length / 2] + m[(m.length / 2) - 1]) / 2.0;
        } else {
            return m[m.length / 2];
        }
    }
}
