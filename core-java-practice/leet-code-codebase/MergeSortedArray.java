import java.util.Arrays;

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int l = m + n;
    for (int i = 0; i < l; i++) {
      if (i >= n)
        break;
      nums1[i + m] = nums2[i];
    }
    Arrays.sort(nums1);
  }
}