package singleton;

/**
 * @author yaokoo
 * @create 2022/6/1 17:04
 */

/**
 * 对懒汉式的改进 在getin方法上加了锁 保证了线程安全但同时带来了效率问题 （判断条件 和赋值应该都锁在一起）
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;
    private Mgr03(){};
    public static synchronized Mgr03 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE=new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(getInstance().hashCode());
            }).start();
        }
    }
}
