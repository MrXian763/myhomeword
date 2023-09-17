package test3;

import java.util.Arrays;

public class TestOrderMatricesProduct {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2},
                {3, 4}
        };
        int[][] arr2 = {
                {5, 6},
                {7, 8}
        };

        OrderMatricesProduct orderMatricesProduct = new OrderMatricesProduct();
        int[][] result = orderMatricesProduct.orderMatricesProduct(arr1, arr2);
        System.out.println(Arrays.deepToString(result));
    }
}
