package singleton;

/**
 * @author yaokoo
 * @create 2022/6/1 16:31
 */

/**
 * 饿汉式
 * 类加载到内存后，就实例化一个单例，jvm保证线程安全 （jvm保证每个class只会装载一次 静态变量只会加载一次） （简单 推荐使用）
 *唯一缺点：不论是否使用 都会实例化单例
 */

public class Mgr01 {
    public static final Mgr01 INSTANCE=new Mgr01();
    private Mgr01(){};
    public static Mgr01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 m1=getInstance();
        Mgr01 m2=getInstance();
        System.out.println(m1==m2);
    }
}
