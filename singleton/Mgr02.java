package singleton;

/**
 * @author yaokoo
 * @create 2022/6/1 16:54
 */

/**
 * 懒汉式 先不进行变量赋值 等需要用到时再进行赋值
 * 虽然达到了按需加载单例的目的 但造成线程不安全问题（在创建实例赋值的过程中可能被其他线程打断）
 */
public class Mgr02 {
    private static Mgr02 INSTANCE;
    private Mgr02(){};
    public static Mgr02 getInstance(){
        if (INSTANCE==null){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE=new Mgr02();
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
