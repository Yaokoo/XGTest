package gyj.proxy.dynamicProxy;

/**
 * @author yaokoo
 * @create 2022/8/8 20:44
 */
public class ProxyTest {
    public static void main(String[] args) {
        TeacherProxy teacherProxy=new TeacherProxy();

        Teacher teacher = (Teacher) teacherProxy.bind(new RealTeacher());

        //teacher.teach() --> $Proxy0.teach() --> super.h.invoke() --> proxy.invoke() --> invocationHandler.invoke()
        teacher.teach();
        /*
          1.创建实现方法的接口
          2。创建实现类
          3.写代理类  代理类实现InvocationHandler接口  通过 newProxyInstance反射实例化出一个代理对象（传入实现类）返回代理类
            --重写invoke方法 进行方法增强
          4. 使用
         */
    }
}
