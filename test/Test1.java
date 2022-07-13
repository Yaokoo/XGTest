package sf.test;

/**
 * @author yaokoo
 * @create 2022/6/25 16:50
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(asf(99));
    }
    //素数暴力破解   找素数 用除法遍历==0就是合数
    public static int bf(int n){
        int count=0;
        for (int i = 2; i < n; i++) {
            count+=isPrime(i)?1:0;
        }
        return count;
    }

    private static boolean isPrime(int x) {
        for (int i = 2; i*i <= x; i++) {//
            if (x%i==0){
                return false;
            }
        }
        return true;
    }

    //埃筛法
    public static int asf(int n){
        int count=0;
        boolean[] isPrime=new boolean[n];
        for (int i = 2; i < n; i++) {
            if (!isPrime[i]){
                count++;
                for (int j = i*i; j < n; j+=i) {
                    isPrime[j]=true;
                }
            }
        }
        return count;
    }
}
