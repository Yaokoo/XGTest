package sf.test;

import java.util.Arrays;

/**
 * @author yaokoo
 * @create 2022/7/15 20:24
 */
public class Test06 {
    public static void main(String[] args) {
        System.out.println(threeMax(new int[]{1,-2,3,4,5,6}));
        System.out.println(threeMax1(new int[]{1,-2,3,4,5,6}));
    }
    public static int threeMax(int[] arr){
        Arrays.sort(arr);
        int length = arr.length;
        int max = Math.max(arr[length - 1] * arr[length - 2] * arr[length - 3], arr[0] * arr[1] * arr[length - 1]);
        return max;
    }
    public static int threeMax1(int[] arr){
        int min1=Integer.MAX_VALUE; int min2=Integer.MAX_VALUE;
        int max1=Integer.MIN_VALUE; int max2=Integer.MIN_VALUE; int max3=Integer.MIN_VALUE;
        for(int x:arr){
            if (x<max1){
                min2=min1;
                max1=x;
            }else if (x<max2){
                max2=x;
            }

            if (x>max1){
                max3=max2;
                max2=max1;
                max1=x;
            }else if (x>max2) {
                max3=max2;
                max2=x;
            }else if (x>max3){
                max3=x;
            }
        }
        return Math.max(max1*max2*max3,min1*min2*max3);
    }
}
