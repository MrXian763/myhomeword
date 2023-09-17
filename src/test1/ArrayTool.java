package test1;

import java.util.Stack;

public class ArrayTool<T> {
    public int[] reverse(int[] num) {
        Stack<Integer> stack = new Stack<>();
        for (int j : num) {
            stack.push(j);
        }

        for (int i = 0; i < num.length; i++) {
            num[i] = stack.pop();
        }
        return num;
    }

    public String toString(int[] nums) {
        String result = "[";
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                result += nums[i] + "]";
            }else {
                result += nums[i] + ",";
            }
        }
        return result;
    }
}
