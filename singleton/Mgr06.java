package singleton;

/**
 * @author yaokoo
 * @create 2022/6/1 17:41
 */

/**
 * 枚举天生单例  解决线程同步 防止反序列化
 */
public enum  Mgr06 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(INSTANCE.hashCode());
            }).start();
        }
    }
}
