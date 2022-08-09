package gyj.proxy.staticProxy;

/**
 * @author yaokoo
 * @create 2022/8/8 20:33
 */
public class ProxyTest {
    public static void main(String[] args) {
        Teacher teacher=new TeacherProxy();
        teacher.teach();
    }

}
