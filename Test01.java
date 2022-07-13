package sf;

/**
 * @author yaokoo
 * @create 2022/6/25 16:14
 */
public class Test01 {  //找素数 两种解法 第一种直接找素数（n能否被小于n的数整除 ）然后把count+1  第二种用boolean数组标记 找合数代替找质数
    public static void main(String[] args) {
        System.out.println(esf(100));
    }
    //素数暴力解法
    public static int bf(int n){
        int count=0;//计数器 是素数+1
        for (int i = 2; i < n ; i++) { //0 1 不算 从2开始到（100以内） 执行函数
            count+=isPrime(i)?1:0;
        }
        return count;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i*i <= x; i++) {//和每个比他小的书相除 能整除就不是素数 返回false   <根号的变写 小于等于
            if (x%i==0){
                return false;
            }
        }
        return true;//如果都没能整除 就是素数  返回true
    }

    //埃筛法
    public static int esf(int n){
        boolean[] isPrime=new boolean[n];//false 表示素数  标记素数
        int count=0;
        for (int i = 2; i <n ; i++) {
            if (!isPrime[i]){
                count++;
                for (int j = i*i; j < n; j+=i) {//j标记合数  +i相当于+项数    循环找合数
                    isPrime[j]=true;
                }
            }
        }
        return count;
    }
}
