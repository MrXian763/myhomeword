package test1;

public class Test1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ArrayTool<Integer> arrayTool = new ArrayTool<>();
        arrayTool.reverse(nums);
        System.out.println(arrayTool.toString(nums));
    }
}
