package singleton;

/**
 * @author yaokoo
 * @create 2022/6/1 17:12
 */

/**
 * 双重检测   要加volatile避免JIT指令重排（new这个过程不是原子性的 ）
 */
public class Mgr04 {
    private static volatile Mgr04 INSTANCE;
    private Mgr04(){};
    public static Mgr04 getInstance(){
        if (INSTANCE==null){
            synchronized (Mgr04.class){
                if (INSTANCE==null){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE=new Mgr04();
                }
            }
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
