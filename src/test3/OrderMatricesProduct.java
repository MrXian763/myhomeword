package test3;

public class OrderMatricesProduct {
    /**
     * 1   2      5   6        1 * 5 + 2 * 7    1 * 6 + 2 * 8
     *        *           =
     * 3   4      7   8        3 * 5 + 4 * 7    3 * 6 + 4 * 8
     *
     * result[0][0] = nums1[0][0] * nums2[0][0] + nums1[0][1] * nums2[1][0]
     * result[0][1] = nums1[0][0] * nums2[0][1] + nums1[0][1] * nums2[1][1]
     * result[1][0] = nums1[1][0] * nums2[0][0] + nums1[1][1] * nums2[1][0]
     * result[1][1] = nums1[1][0] * nums2[0][1] + nums1[1][1] * nums2[1][1]
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public int[][] orderMatricesProduct(int[][] nums1, int[][] nums2) {
        int length = nums1.length;
        int[][] result = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                for (int k = 0; k < length; k++) {
                    result[i][j] += nums1[i][k] * nums2[k][j];
                }
            }
        }
        return result;
    }
}
