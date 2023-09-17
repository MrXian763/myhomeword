package test2;

public class TestMaximumSum {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, -3, 7, 8, 9, -20};

        MaximumSum maximumSum = new MaximumSum();
        System.out.println(maximumSum.findMaxmunSum(arr1));
        System.out.println(maximumSum.findMaxmunSum(arr2));
    }
}
