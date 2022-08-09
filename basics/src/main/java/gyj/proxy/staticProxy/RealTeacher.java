package gyj.proxy.staticProxy;

/**
 * @author yaokoo
 * @create 2022/8/8 20:30
 */
public class RealTeacher implements Teacher {
    @Override
    public void teach() {
        System.out.println("老师教书");
    }
}
