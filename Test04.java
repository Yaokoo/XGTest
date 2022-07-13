package sf;

/**
 * @author yaokoo
 * @create 2022/6/28 10:40
 */
public class Test04 {
    //求平方根    两种解法 1.二分查找  2.牛顿迭代
    public static void main(String[] args) {
        System.out.println(newton(6));
    }
    public static int bs(int n){
        int index=-1;    //01都有可能是结果 标志指针不能定义为01
        int left=0;
        int rigth=n/2;   //根号必定小于数的一半
        while (left<=rigth){ //相等时找到  即在小于等于中执行
            int mid=left+(rigth-left)/2;  //先找到一个值  平方看是否相等 小的话定一下 左指针往中间偏右移
            if (mid*mid<=n){
                index=mid;     //小于等于可能是这个数 大于等于不一定是这个数
                left=mid+1;
            }else {
                rigth=mid-1;
            }
        }
        return index;
    }

    public static int newton(int x){
        if (x==0){
            return 0;
        }
        return (int) sqrt(x,x);
    }
    public static double sqrt(double i,int x){
        double res=(i+x/i)/2;  //牛顿迭代公式    i+n/i  /  2  =x   如果x=i 则x是平方根   一直递归换i就可以得到
        if (res==i){
            return i;
        }else {
          return  sqrt(res,x);
        }
    }
}
