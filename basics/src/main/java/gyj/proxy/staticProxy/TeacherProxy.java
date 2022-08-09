package gyj.proxy.staticProxy;

/**
 * @author yaokoo
 * @create 2022/8/8 20:32
 */
public class TeacherProxy implements Teacher{

    Teacher teacher=new RealTeacher();
    @Override
    public void teach() {
        System.out.println("-----");
        teacher.teach();
        System.out.println("******");
    }
}
