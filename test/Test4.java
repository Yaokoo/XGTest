package sf.test;

/**
 * @author yaokoo
 * @create 2022/6/28 11:04
 */
public class Test4 {
    public static void main(String[] args) {
        System.out.println(bs(12));
    }
    //二分查找 左右指针移动
    public static int bs(int x){
        int index=-1;
        int left=0;
        int right=x;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (mid*mid<=x){
                index=mid;
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return index;
    }
    //牛顿迭代
    public static int newton(int x){
        if (x==0){
            return 0;
        }
        return (int) sqrt(x,x);
    }
    public static double sqrt(double i,int x){
        double res=(i+x/i)/2;  //将牛顿迭代过时算出的值赋给一个值
        if (res==i){  //如果这个值和传进来的任意数相等 则他就是平方根
            return res;
        }else {
            return sqrt(res,x); //否则递归
        }
    }
}
