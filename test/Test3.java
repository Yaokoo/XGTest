package sf.test;

import java.util.Arrays;

/**
 * @author yaokoo
 * @create 2022/6/27 14:54
 */
public class Test3 {
    public static void main(String[] args) {
        //寻找中心下标（左右两边相等）
        System.out.println(smid(new int[]{1, 7, 3, 6, 5, 6}));
    }
    public static int smid(int[] sums){
        int total=Arrays.stream(sums).sum();
        int num=0;
        for (int i = 0; i < sums.length; i++) {
            if (2*num+sums[i]==total){
                return i;
            }
            num+=sums[i];
        }
        return -1;
    }
}
