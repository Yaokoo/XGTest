package sf;

import java.util.Arrays;

/**
 * @author yaokoo
 * @create 2022/6/27 14:16
 */
public class Test03 {
    //寻找数组的中心索引    前缀法：一个数存储总和 一个数存储一边的值  /  总和=一边的值+一边的值+当前位置上的值
    public static void main(String[] args) {
        System.out.println(midc(new int[]{1, 7, 3, 6, 5, 6}));
    }
    public static int midc(int[] nums){
        //流计算 计算总和
        int total= Arrays.stream(nums).sum();
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            if (2*sum+nums[i]==total){
                return i;
            }
            sum+=nums[i];
        }
        return -1;
    }
}
