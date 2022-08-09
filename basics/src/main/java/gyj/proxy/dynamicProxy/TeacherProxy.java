package gyj.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yaokoo
 * @create 2022/8/8 20:38
 */
public class TeacherProxy implements InvocationHandler {
    private Object tar;
    public Object bind(Object object){
        this.tar=object;
        //三个参数  实现类的class 实现类的接口信息 代理类
        return Proxy.newProxyInstance(tar.getClass().getClassLoader(), tar.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----");
        Object result = method.invoke(tar, args);
        System.out.println("*****");
        return result;
    }
}
